package com.github.blogw.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by blogw on 2016/03/07.
 */
@Controller
public class ErrorController extends BaseController {
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String error404() {
        return "error/404";
    }

    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public String error500() {
        return "error/500";
    }
}
