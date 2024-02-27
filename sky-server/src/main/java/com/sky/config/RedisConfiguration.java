package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@Slf4j
public class RedisConfiguration {

    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        log.info("redisTemplate init...");
        RedisTemplate redisTemplate = new RedisTemplate();
        // 设置连接工厂
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // key序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        return redisTemplate;
    }
}