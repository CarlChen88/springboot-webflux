package com.javatechie.webflux.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author chenxiang
 * @vesion 1.0
 * @Description TODO
 * @createTime 2022-05-14 20:50:50
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloImportBeanDefinitionRegistrar.class)
public @interface EnableConfigurationImport {
}
