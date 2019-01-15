package com.rongyi.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus  配置
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Configuration
public class MybatisPlusConfiguration1 {


    /**
     * mybatis-plus 分页插件
     */

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }


//    @Autowired
//    private DataSource dataSource;

//    @Autowired
//    private MybatisProperties properties;

//    @Autowired


//private ResourceLoader resourceLoader = new DefaultResourceLoader();
//
//    @Autowired(required = false)
//    private Interceptor[] interceptors;
//
//    @Autowired(required = false)
//    private DatabaseIdProvider databaseIdProvider;
//
//    /**
//     *   mybatis-plus分页插件
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType("mysql");
//        return page;
//    }
//    /**
//     * 这里全部使用mybatis-autoconfigure 已经自动加载的资源。不手动指定
//     * 配置文件和mybatis-boot的配置文件同步
//     * @return
//     */
//    @Bean
//    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
//        MybatisSqlSessionFactoryBean mybatisPlus = new MybatisSqlSessionFactoryBean();
//        mybatisPlus.setDataSource(dataSource);
//        mybatisPlus.setVfs(SpringBootVFS.class);
//        if (StringUtils.hasText(this.properties.getConfigLocation())) {
//            mybatisPlus.setConfigLocation(this.resourceLoader.getResource(this.properties.getConfigLocation()));
//        }
//        mybatisPlus.setConfiguration(properties.getConfiguration());
//        if (!ObjectUtils.isEmpty(this.interceptors)) {
//            mybatisPlus.setPlugins(this.interceptors);
//        }
//        MybatisConfiguration mc = new MybatisConfiguration();
//        mc.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
//        mybatisPlus.setConfiguration(mc);
//        if (this.databaseIdProvider != null) {
//            mybatisPlus.setDatabaseIdProvider(this.databaseIdProvider);
//        }
//        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
//            mybatisPlus.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
//        }
//        if (StringUtils.hasLength(this.properties.getTypeHandlersPackage())) {
//            mybatisPlus.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
//        }
//        if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
//            mybatisPlus.setMapperLocations(this.properties.resolveMapperLocations());
//        }
//        return mybatisPlus;
//    }
//

}
