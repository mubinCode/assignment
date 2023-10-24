package com.abdullah.config;

import com.abdullah.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    @Bean
    public JedisConnectionFactory getConnection(){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        return jedisConnectionFactory;
    }
    @Bean
    public RedisTemplate<Long, Person> getTemplate(){
        RedisTemplate<Long, Person> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(getConnection());
        return redisTemplate;
    }
}
