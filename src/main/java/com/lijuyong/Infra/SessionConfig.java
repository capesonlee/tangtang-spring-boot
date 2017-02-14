package com.lijuyong.Infra;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by john on 2017/2/14.
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig {
}
