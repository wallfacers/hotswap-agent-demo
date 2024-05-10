package com.wallfacers.hotswapagent.demo.dao;


import com.wallfacers.hotswapagent.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {


    User selectUserById(Long id);

}
