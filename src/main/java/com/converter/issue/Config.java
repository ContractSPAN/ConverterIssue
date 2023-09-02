package com.converter.issue;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    private final RsaKeyProperties rsaKeyProperties;

    public Config(RsaKeyProperties rsaKeyProperties) {
        this.rsaKeyProperties = rsaKeyProperties;
    }
}
