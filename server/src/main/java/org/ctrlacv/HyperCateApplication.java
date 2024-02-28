package org.ctrlacv;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@EnableScheduling //开启定时任务
@Slf4j
public class HyperCateApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyperCateApplication.class, args);
        log.info("server started");
    }
}
