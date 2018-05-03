package com.spring.springbootlearn.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/3 16:08
 */
@ConfigurationProperties(prefix = "my")
public class Config {
    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return this.servers;
    }
}
