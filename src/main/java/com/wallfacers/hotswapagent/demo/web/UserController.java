package com.wallfacers.hotswapagent.demo.web;

import com.wallfacers.hotswapagent.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userMapper;

    // http://127.0.0.1:8080/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return userMapper.hello();
    }



}
