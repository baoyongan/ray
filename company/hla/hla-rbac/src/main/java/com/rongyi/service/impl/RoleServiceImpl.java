package com.rongyi.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.rongyi.constants.Constant;
import com.rongyi.dao.RoleDao;
import com.rongyi.entity.Authority;
import com.rongyi.entity.Role;
import com.rongyi.entity.RoleAuthority;
import com.rongyi.entity.UserInfo;
import com.rongyi.param.RoleListParam;
import com.rongyi.param.RoleParam;
import com.rongyi.service.RoleService;
import com.rongyi.utils.StringUtil;
import com.rongyi.vo.RoleAuthDeatilVO;
import com.rongyi.vo.RoleDetailVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    public Integer saveOrUpdate(Role role, UserInfo user) {
        log.info("=========添加或修改角色==========");
        if (role.getName() != null && role.getName() != "" && (StringUtil.stringLength(role.getName().trim()) < 2 || StringUtil.stringLength(role.getName().trim()) > 40)) {
            throw new RuntimeException("请输入长度为2-40字符内的角色名");
        }
        if (role.getMemo().isEmpty())
            if (StringUtil.stringLength(role.getMemo().trim()) > 200) {
                throw new RuntimeException("请输入长度在200字符以内的备注");
            }
        if (role.getId() == null) {
//			if(roleDao.getRoleCountByName(role.getName()).intValue()>0){
//				throw new RunAtException("角色名称不能重复");
//			}
            role.setStatus((byte) 0);
            role.setCreateBy(user.getId());
            role.setCreateAt(new Date());
            role.setUpdateBy(user.getId());
            role.setUpdateAt(new Date());
            roleDao.saveRole(role);
        } else {
            role.setUpdateBy(user.getId());
            role.setUpdateAt(new Date());
            roleDao.updateRoleById(role);
        }
        return role.getId();
    }

    /**
     * 添加或修改角色
     *
     * @param param
     * @param user
     * @return
     */
    public Integer saveOrUpdateRole(RoleParam param, UserInfo user) {
        log.info("=========添加或修改角色==========" + user.getId());
        Role role = new Role();
        role.setName(param.getName());//角色名称
        role.setMemo(param.getRemark());//备注
        if (param.getId() == null) {
//			if(roleDao.getRoleCountByName(role.getName()).intValue()>0){
//				throw new RunAtException("角色名称不能重复");
//			}
            role.setStatus((byte) 0);
            role.setCreateBy(user.getId());
            role.setCreateAt(new Date());
            role.setUpdateBy(user.getId());
            role.setUpdateAt(new Date());
            roleDao.saveRole(role);
        } else {
            role.setId(param.getId());
            role.setUpdateBy(user.getId());
            role.setUpdateAt(new Date());
            roleDao.updateRoleById(role);
        }
        return role.getId();
    }

    public Role getRoleById(Integer id) {
        return roleDao.getRoleById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public RoleDetailVO roleById(Integer id) {
        Role role = roleDao.getRoleById(id);
        if (role == null) {
            return null;
        }
        return buildRoleDetail(role);
    }

    private RoleDetailVO buildRoleDetail(Role role) {
        RoleDetailVO roleDetailVO = new RoleDetailVO();
        roleDetailVO.setId(role.getId());
        roleDetailVO.setName(role.getName());
        roleDetailVO.setStatus(role.getStatus());
        return roleDetailVO;

    }

    /**
     * 根据角色id查询角色详情
     *
     * @param roleId
     * @return
     */
    public RoleDetailVO getRoleDetailVO(Integer roleId) {
        RoleDetailVO vo = null;
        Role role = getRoleById(roleId);
        if (role != null) {
            vo = new RoleDetailVO(role);
            List<Authority> authList = getAuthorityList(role.getId());
            if (CollectionUtils.isNotEmpty(authList) && !authList.isEmpty()) {
                vo.setAuthList(authList);//角色关联的权限列表
            } else {
                vo.setAuthList(null);
            }
        }
        return vo;
    }

    /**
     * 获取角色权限页面详情
     *
     * @param roleId
     * @return
     */
    public RoleAuthDeatilVO getRoleAuthDetailVO(Integer roleId) {
        RoleAuthDeatilVO vo = null;
        Role role = getRoleById(roleId);
        if (role != null) {
            vo = new RoleAuthDeatilVO(role);
            List<Authority> authList = getRoleAuthList(role.getId());
            if (CollectionUtils.isNotEmpty(authList) && !authList.isEmpty()) {
                vo.setAuthList(authList);//权限列表
            } else {
                vo.setAuthList(null);
            }
        }
        return vo;
    }

    /**
     * 获取权限列表并判断角色是否与权限关联
     *
     * @param roleId
     * @return
     */
    public List<Authority> getRoleAuthList(Integer roleId) {
        //查询所有的权限信息
        List<Authority> authList0 = getAuthorityList(null);
        //查询角色关联的权限信息
        List<RoleAuthority> roleAuthList = roleDao.getRoleAuthListByRoleId(roleId);
        if (CollectionUtils.isNotEmpty(roleAuthList) && !roleAuthList.isEmpty()) {
            for (RoleAuthority roleAuth : roleAuthList) {
                if (CollectionUtils.isNotEmpty(authList0) && !authList0.isEmpty()) {
                    //判断第一级权限是否与角色关联
                    for (Authority authority0 : authList0) {
                        if (authority0.getId().equals(roleAuth.getAuthorityId())) {
                            authority0.setHasRelation(true);//角色是否与权限关联  true是，false否
                            continue;
                        }
                        List<Authority> authList1 = authority0.getList();
                        if (CollectionUtils.isNotEmpty(authList1) && !authList1.isEmpty()) {
                            //判断第二级权限是否与角色关联
                            for (Authority authority1 : authList1) {
                                if (authority1.getId().equals(roleAuth.getAuthorityId())) {
                                    authority1.setHasRelation(true);//角色是否与权限关联  true是，false否
                                    continue;
                                }
                                List<Authority> authList2 = authority1.getList();
                                if (CollectionUtils.isNotEmpty(authList2) && !authList2.isEmpty()) {
                                    //判断第三级权限是否与角色关联
                                    for (Authority authority2 : authList2) {
                                        if (authority2.getId().equals(roleAuth.getAuthorityId())) {
                                            authority2.setHasRelation(true);//角色是否与权限关联  true是，false否
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return authList0;
    }

    public List<Role> getRoleListByCondition(Map map) {
        map.put("pageSize", Constant.RolePage.pageSize);
        map.put("startRecordIndex", (map.get("currpage") != null ? Integer.parseInt(map.get("currpage").toString()) : 0) * Constant.UserPage.pageSize);
        System.out.println(map.get("status") + "...status");
        return roleDao.getRoleListByCondition(map);
    }

    public int turnonRoleById(Map map) {
        log.info("=====修改角色状态=======");
        map.put("disableAt", new Date());
        return roleDao.turnonRoleById(map);
    }

    /**
     * 启用/停用用户角色
     *
     * @param param
     * @return
     */
    public int updateRoleStatus(RoleParam param) {
        log.info("=====修改角色状态=======");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", param.getId());
        map.put("status", param.getStatus());
        if (param.getStatus() == 1) {
            map.put("disableAt", new Date());
            map.put("reason", param.getReason());
        }
        return roleDao.updateStatusById(map);
    }

    /**
     * 查询角色列表
     *
     * @param param
     * @return
     */
    public List<Role> getRoleList(RoleListParam param) {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        paraMap.put("pageSize", param.getPageSize());
        paraMap.put("startRecordIndex", (param.getCurrentPage() - 1) * param.getPageSize());
        paraMap.put("name", param.getName());
        paraMap.put("status", param.getStatus());
        log.info("RoleService|getRoleList|角色名:" + param.getName() + ";状态:" + param.getStatus());
        return roleDao.getRoleListByCondition(paraMap);
    }

    /**
     * 查询角色列表(接口)
     *
     * @param param
     * @return
     */
    @Override
    public List<RoleDetailVO> roleList(RoleListParam param) {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        paraMap.put("pageSize", param.getPageSize());
        paraMap.put("startRecordIndex", (param.getCurrentPage() - 1) * param.getPageSize());
        if (StringUtils.isNotEmpty(param.getName())) {
            paraMap.put("name", param.getName());
        }
        if (param.getStatus() != null) {
            paraMap.put("status", param.getStatus());
        }
        log.info("RoleService|roleList|角色名:" + param.getName() + ";状态:" + param.getStatus());
        List<Role> role = roleDao.getRoleListByCondition(paraMap);
        return buildRoleList(role);
    }

    private List<RoleDetailVO> buildRoleList(List<Role> roleList) {
        List<RoleDetailVO> roleDetailVOS = new ArrayList<>();
        for (Role role : roleList) {
            RoleDetailVO vo = new RoleDetailVO();
            vo.setId(role.getId());
            vo.setName(role.getName());
            vo.setStatus(role.getStatus());
            roleDetailVOS.add(vo);
        }
        return roleDetailVOS;
    }

    /**
     * 查询角色列表数量
     *
     * @param param
     * @return
     */
    @Override
    public Integer getRolesCount(RoleListParam param) {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        paraMap.put("name", param.getName());
        paraMap.put("status", param.getStatus());
        log.info("RoleService|getRolesCount|角色名:" + param.getName() + ";状态:" + param.getStatus());
        return roleDao.getRolesCount(paraMap);
    }

    /**
     * 查询权限列表
     *
     * @return
     */
    public List<Authority> getAuthorityList(Integer roleId) {
        //查询权限最大的父节点
        List<Authority> result = roleDao.getAuthorityListByParentId(0, roleId);

        /*
         * 循环查询出父权限的子权限
         */
        for (Authority authority : result) {
            int parentId = authority.getId();
            List<Authority> parentList = roleDao.getAuthorityListByParentId(parentId, roleId);
            authority.setList(parentList);
            for (Authority authority2 : parentList) {
                int id = authority2.getId();
                List<Authority> list = roleDao.getAuthorityListByParentId(id, roleId);
                authority2.setList(list);
            }
        }
        return result;
    }

    /**
     * 保存角色权限对应信息
     *
     * @param roleId
     * @param authIds 保存权限ID的字符串   多个字符串之间用-隔开
     * @return
     */
    public int saveRoleAuthority(Integer roleId, String authIds) {
        log.info("=====修改角色权限=====");
        Map map = new HashMap();
        map.put("roleId", roleId);
        map.put("auths", authIds.split("-"));
        return roleDao.saveRoleAuthority(map);
    }

    /**
     * 保存角色权限对应信息
     *
     * @param roleId
     * @param authIds
     * @return
     */
    public int updateRoleAuthority(Integer roleId, List<Integer> authIds) {
        log.info("=====修改角色权限=====");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("roleId", roleId);
        map.put("auths", authIds);
        return roleDao.saveRoleAuth(map);
    }

    /**
     * 修改角色权限
     *
     * @param role
     * @param authIds
     * @return
     */
    public int updateRoleAuths(Role role, List<Integer> authIds, UserInfo user) {
        log.info("====修改角色权限=====");
        saveOrUpdate(role, user);
        if (CollectionUtils.isEmpty(authIds)) {
            return roleDao.delRoleAuthByRoleId(role.getId());
        } else {
            roleDao.delRoleAuthByRoleId(role.getId());
            return updateRoleAuthority(role.getId(), authIds);
        }
    }

    /**
     * 修改角色详情
     *
     * @param role
     * @param authIds
     * @return
     */
    public int updateRoleAuth(Role role, String authIds, UserInfo user) {
        log.info("====修改角色详情=====");
        roleDao.delRoleAuthByRoleId(role.getId());
        saveOrUpdate(role, user);
        return saveRoleAuthority(role.getId(), authIds);
    }

    /**
     * 根据角色ID查询角色权限列表
     *
     * @param roleId 角色ID
     * @return
     */
    public List<RoleAuthority> getRoleAuthListByRoleId(Integer roleId) {
        return roleDao.getRoleAuthListByRoleId(roleId);
    }

    /**
     * 查询角色详情
     *
     * @param roleId
     * @return
     */
    public Map getRoleDetailByRoleId(Integer roleId) {
        Map result = new HashMap();
        List<Authority> auths = getAuthorityList(null);
        List<Authority> roleAuths = getAuthorityList(roleId);
        result.put("role", getRoleById(roleId));
        result.put("auths", auths);
        result.put("roleAuths", roleAuths);
        StringBuilder roleAuthsStr = new StringBuilder();
        List<RoleAuthority> list = getRoleAuthListByRoleId(roleId);
        for (RoleAuthority roleAuthority : list) {
            roleAuthsStr.append(roleAuthority.getAuthorityId() + "-");
        }
        result.put("roleAuthsStr", roleAuthsStr.toString());
        return result;
    }

    /**
     * 查询角色列表总记录数
     *
     * @param map
     * @return
     */
    public int getRoleCount(Map map) {
        return roleDao.countByExample(map);
    }

    /**
     * 根据状态查询角色列表
     *
     * @param status
     * @return
     */
    public List<Role> getRoleListByStatus(Integer status) {
        return roleDao.getRoleListByStatus(status);
    }

}
