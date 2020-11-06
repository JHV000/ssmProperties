package com.leave.service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 用户业务层接口
 */

public interface IUserService {
    int queryUser(Map<String,Object> map);
}
