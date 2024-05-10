package com.wallfacers.hotswapagent.demo.service;

import com.wallfacers.hotswapagent.demo.dao.UserMapper;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements ApplicationContextAware {


    @Resource
    private UserMapper userMapper;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public String hello() {
        System.out.println(this.applicationContext.getApplicationName());
        return userMapper.selectUserById(2L).getName();
    }

}
