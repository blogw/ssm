package com.github.blogw.core.spring;

import com.github.blogw.core.config.AppGlobal;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * AppContextListener
 * Created by blogw on 2017/04/13.
 */
public class SSMContextListener extends ContextLoaderListener {

    @Override
    public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
        AppGlobal.printWelcome();
        return super.initWebApplicationContext(servletContext);
    }
}
