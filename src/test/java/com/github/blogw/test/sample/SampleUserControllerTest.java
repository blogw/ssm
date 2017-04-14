package com.github.blogw.test.sample;

import com.github.blogw.sample.entity.SampleUser;
import com.github.blogw.test.core.BaseMVCTest;
import com.jayway.jsonpath.JsonPath;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * RestControllerTest
 * Created by blogw on 2017/04/13.
 */
public class SampleUserControllerTest extends BaseMVCTest {
    @Test
    public void rest() throws Exception {
        String json = getMockMvc().perform(get("/sample/user"))
                .andExpect(status().is2xxSuccessful())
                .andReturn().getResponse().getContentAsString();
        log.info(json);
        String name = JsonPath.read(json, "$.single.name");
        int age = JsonPath.read(json, "$.single.age");
        Assert.assertEquals("玛丽", name);
        Assert.assertEquals(20, age);
    }

    @Test
    public void normal() throws Exception {
        MvcResult result = getMockMvc().perform(get("/sample"))
                .andExpect(view().name("sample/index"))
                .andExpect(forwardedUrl("/WEB-INF/view/sample/index.jsp"))
                .andExpect(status().isOk())
                .andReturn();
        SampleUser user = (SampleUser) result.getModelAndView().getModel().get("user");
        Assert.assertEquals("玛丽", user.getName());
        Assert.assertEquals(20, user.getAge());
    }

}
