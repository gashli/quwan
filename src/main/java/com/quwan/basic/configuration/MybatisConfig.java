package com.quwan.basic.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:quwan.properties" })
//@MapperScan(basePackages = "com.quwan.basic.dao")
public class MybatisConfig implements TransactionManagementConfigurer {

    @Autowired
    private Environment env;

//    @Autowired
//    private DataSource dataSource;

    @Bean(name = "dataSource")
    public BasicDataSource quwanDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(env.getProperty("quwan.driverClassName"));
        dataSource.setUrl(env.getProperty("quwan.url"));
        dataSource.setUsername(env.getProperty("quwan.username"));
        dataSource.setPassword(env.getProperty("quwan.password"));
        dataSource.setMaxActive(200);
        dataSource.setInitialSize(5);
        dataSource.setMaxWait(30000);
        dataSource.setMaxIdle(20);
        dataSource.setMinIdle(5);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(30);// 单位为妙
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnReturn(true);
        dataSource.setValidationQuery("select 1");
        dataSource.setNumTestsPerEvictionRun(20);
        dataSource.setMinEvictableIdleTimeMillis(1800000);//3分钟
        return dataSource;
    }


    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(  quwanDataSource());

        //分页插件
//        PageHelper pageHelper = new PageHelper();

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource[] resources = resolver.getResources("mapper/*.xml");
            bean.setMapperLocations(resources);
            bean.setTypeAliasesPackage("com.quwan.basic.entity");
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sessionFactory){
        return new SqlSessionTemplate(sessionFactory);
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(  quwanDataSource());
    }
}
