package com.pabloriosramirez.springboot.dynamicjasper;

import com.pabloriosramirez.springboot.dynamicjasper.report.DynamicReportView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
    "com.pabloriosramirez.springboot.dynamicjasper.controller",
    "com.pabloriosramirez.springboot.dynamicjasper.service"})
public class WebAppConfig {

    @Bean
    public ViewResolver reportViewResolver() {
        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
        resolver.setViewNames("*_DynamicReport");
        resolver.setViewClass(DynamicReportView.class);
        resolver.setOrder(1);
        return resolver;
    }

    @Bean
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }
}
