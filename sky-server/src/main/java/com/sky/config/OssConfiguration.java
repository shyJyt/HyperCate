package com.sky.config;

import com.sky.properties.AliOssProperties;
import com.sky.properties.QiniuOssProperties;
import com.sky.utils.AliOssUtil;
import com.sky.utils.QiniuOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class OssConfiguration {

    /**
     * 初始化QiniuOssUtil
     *
     */
    @Bean
    @ConditionalOnMissingBean
    public QiniuOssUtil qiniuOssUtil(QiniuOssProperties qiniuOssProperties) {
        log.info("初始化QiniuOssUtil...{}", qiniuOssProperties);
        return new QiniuOssUtil(qiniuOssProperties.getAccessKey(), qiniuOssProperties.getSecretKey(), qiniuOssProperties.getBucket(), qiniuOssProperties.getDomain());
    }
}
