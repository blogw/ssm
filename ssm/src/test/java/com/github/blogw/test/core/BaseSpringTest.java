package com.github.blogw.test.core;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * BaseSpringTest
 * Created by blogw on 2017/04/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
        "classpath:spring/spring-root.xml",
        "classpath:spring/spring-mvc.xml"})
public class BaseSpringTest {
    public Logger log = LoggerFactory.getLogger(this.getClass());
}
