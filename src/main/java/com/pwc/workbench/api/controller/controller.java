package com.pwc.workbench.api.controller;

import com.pwc.workbench.api.pojo.HelloPojo;
import com.pwc.workbench.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    @ResponseBody
    public String helloWorld2(@RequestParam String name){
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    @ResponseBody
    public String helloWorld3(@RequestBody HelloPojo helloPojo){
        return "Hello " + helloPojo.getName();
    }
}
