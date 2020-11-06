package com.leave.mapper;

import java.util.Map;

/**
 * 用户持久层接口
 */

public interface UserMapper {

    //查询用户
    int queryUser(Map<String,Object> map);

}
