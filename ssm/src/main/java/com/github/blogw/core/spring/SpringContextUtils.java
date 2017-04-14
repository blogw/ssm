package com.github.blogw.core.spring;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * SpringContextUtils
 * Created by blogw on 2017/04/13.
 */
@Service
public class SpringContextUtils implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext ac = null;

    @Override
    //必须在SpringMVC初始化后才能得到全部的ApplicationContext，不然得到的是没有SpringMVC的
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.ac = applicationContext;
    }

    @Override
    public void destroy() throws Exception {
        ac = null;
    }

    public static <T> T getBean(Class<T> type) {
        assertNotNull();
        return ac.getBean(type);
    }

    private static void assertNotNull() {
        Validate.validState(ac != null, "ApplicaitonContext not injected !");
    }

}
