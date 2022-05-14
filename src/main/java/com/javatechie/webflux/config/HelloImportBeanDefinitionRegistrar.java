package com.javatechie.webflux.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.util.Map;
import java.util.Set;

/**
 * @author chenxiang
 * @vesion 1.0
 * @Description TODO
 * @createTime 2022-05-14 20:41:41
 */
public class HelloImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        String name = ComponentScan.class.getName();
        //registry.registerBeanDefinition();
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(HelloService.class);
        registry.registerBeanDefinition("sss",rootBeanDefinition);
       //ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry,false);
        //注解
        //AnnotationTypeFilter annotationTypeFilter = new AnnotationTypeFilter(Mapper.class);
        //类
        //AssignableTypeFilter assignableTypeFilter = new AssignableTypeFilter(HelloService.class);
        //scanner.addIncludeFilter(assignableTypeFilter);
        //scanner.scan("com.javatechie.webflux");
    }
}
