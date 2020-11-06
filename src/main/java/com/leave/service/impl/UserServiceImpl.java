package com.leave.service.impl;

import com.leave.mapper.UserMapper;
import com.leave.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 接口的用户业务层实现类
 */

//注解定义为Service层
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据条件查询用户
     *
     * @param map
     * @return
     */
    @Override
    public int queryUser(Map<String, Object> map) {
        return userMapper.queryUser(map);
    }
}
