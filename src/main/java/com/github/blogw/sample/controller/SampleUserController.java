package com.github.blogw.sample.controller;

import com.github.blogw.core.controller.BaseController;
import com.github.blogw.sample.entity.SampleUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RestController
 * Created by blogw on 2017/04/13.
 */
@Controller
public class SampleUserController extends BaseController {
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String sampleuser(Model model) throws Exception {
        SampleUser user = new SampleUser();
        user.setAge(20);
        user.setName("玛丽");
        model.addAttribute("user", user);
        return "sample/index";
    }
}
