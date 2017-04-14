package com.github.blogw.core.entity;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * RestResponse
 * Created by blogw on 2017/04/13.
 */
public class RestResponse {
    private int result;
    List<ObjectError> errors;
    private String msg;
    private Object single;
    private List<?> list;

    private RestResponse() {

    }

    public static RestResponse success(String msg) {
        RestResponse response = new RestResponse();
        response.result = 1;
        response.msg = msg;
        return response;
    }

    public static RestResponse success(Object single) {
        RestResponse response = new RestResponse();
        response.result = 1;
        response.single = single;
        return response;
    }

    public static RestResponse success(List<?> list) {
        RestResponse response = new RestResponse();
        response.result = 1;
        response.list = list;
        return response;
    }

    public static RestResponse error(String msg) {
        RestResponse response = new RestResponse();
        response.result = 0;
        response.msg = msg;
        return response;
    }

    public static RestResponse error(BindingResult result) {
        RestResponse response = new RestResponse();
        response.result = 0;
        response.errors = result.getAllErrors();
        return response;
    }

    public int getResult() {
        return result;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }

    public String getMsg() {
        return msg;
    }

    public Object getSingle() {
        return single;
    }

    public List<?> getList() {
        return list;
    }
}
