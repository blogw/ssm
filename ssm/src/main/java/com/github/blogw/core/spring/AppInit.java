package com.github.blogw.core.spring;

import com.github.blogw.core.config.AppConstant;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Created by blogw on 2017/04/14.
 */
public class AppInit implements InitializingBean, ServletContextAware {
    private ServletContext servletContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        WebApplicationContext webac = WebApplicationContextUtils.getWebApplicationContext(servletContext, AppConstant.SPRINGMVCSERVLET);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext=servletContext;
    }
}
