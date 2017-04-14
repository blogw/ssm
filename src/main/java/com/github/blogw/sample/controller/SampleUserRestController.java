package com.github.blogw.sample.controller;

import com.github.blogw.core.config.AppGlobal;
import com.github.blogw.core.controller.RestBaseController;
import com.github.blogw.core.entity.RestResponse;
import com.github.blogw.sample.entity.SampleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 * Created by blogw on 2017/04/13.
 */
@RestController
public class SampleUserRestController extends RestBaseController {
    @RequestMapping(value = "/sample/user", method = RequestMethod.GET)
    public RestResponse sampleuser() throws Exception {
        AppGlobal.formatJson(true);

        SampleUser user = new SampleUser();
        user.setAge(20);
        user.setName("玛丽");
        RestResponse response = RestResponse.success(user);
        return response;
    }

    @RequestMapping(value = "/sample/user2", method = RequestMethod.GET)
    public RestResponse sampleuser2() throws Exception {
        AppGlobal.formatJson(false);

        SampleUser user = new SampleUser();
        user.setAge(20);
        user.setName("玛丽");
        RestResponse response = RestResponse.success(user);
        return response;
    }
}
