package com.rhb.first.config;

import com.rhb.first.filter.MyFilter;
import com.rhb.first.listener.MyListerner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRequestListener;

/**
 * @author rhb
 * @Date 2020/2/3
 */
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListerner myListerner;

    @Bean
    public FilterRegistrationBean initFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    public ServletListenerRegistrationBean initListener(){
        ServletListenerRegistrationBean requestListener=new ServletListenerRegistrationBean();
        requestListener.setListener(myListerner);
        return requestListener;
    }
}
