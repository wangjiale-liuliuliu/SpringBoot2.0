package com.example.springboot_git.config;

import com.example.springboot_git.interceptor.MyIntercepor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("login");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
        registry.addInterceptor(new MyIntercepor()).addPathPatterns("/**").excludePathPatterns( "/login","/toLogin","/static/**");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
