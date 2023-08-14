package lk.ijse.dep10;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig {

    @Bean
    public BasicDataSource basicDataSource(){
        BasicDataSource pool=new BasicDataSource();
        pool.setPassword("1234");
        pool.setUsername("root");
        pool.setMaxTotal(20);
        pool.setInitialSize(10);
        pool.setDriverClassName("com.mysql.cj.jdbc.Driver");
        pool.setUrl("jdbc:mysql://localhost:3306/dep10_pos?createDatabaseIfNotExist=true");
        return pool;
    }
}
