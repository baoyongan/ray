package com.arc.jpa.controller;

import com.arc.jpa.model.domain.RR;
import com.arc.jpa.repository.RRRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 叶超
 * @since 2019/4/30 9:43
 */
@Slf4j
@RestController
@RequestMapping("/rrs")
public class TestRRByJpaController {

    @Autowired
    private RRRepository rrRepository;

    @GetMapping("/get/{roleId}")
    public Object get(@PathVariable Long roleId) {
        RR byQuery = rrRepository.findByRoleId(roleId);
        return byQuery;
    }

    @GetMapping("/get/left/join/{roleId}")
    public Object getByJoin(@PathVariable Long roleId) {
        List<RR> byQuery = rrRepository.listByRoleId(roleId);
        return byQuery;
    }

    @GetMapping("/list")
    public Object list() {
        return rrRepository.findAll();
    }

}
