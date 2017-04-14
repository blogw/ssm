package com.github.blogw.test.core;

import com.github.blogw.core.config.AppGlobal;
import org.junit.Test;

/**
 * Created by blogw on 2017/04/13.
 */
public class AppGlobalTest extends BaseSpringTest{
    @Test
    public void welcome(){
        AppGlobal.printWelcome();
    }

    @Test
    public void config(){
    }
}
