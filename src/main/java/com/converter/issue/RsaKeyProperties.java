package com.converter.issue;

import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("rsa")
@Getter
@Setter
@AllArgsConstructor
public class RsaKeyProperties {
    private RSAPublicKey publicKey;

}