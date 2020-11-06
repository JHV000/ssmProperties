package com.leave.controller;

import com.leave.common.AssembleResponseMsg;
import com.leave.model.ResponseBody;
import com.leave.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制层
 */

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/queryUser",produces = "application/json;charset=utf-8")
    public ResponseBody queryUser(@RequestBody Map<String,Object> map){

        int flag = userService.queryUser(map);
        String name = "jhv";
        Map<String,String> all = new HashMap<>();
        if (flag==1){
            //账户密码输入正确
            for (Map.Entry<String,Object> entry: map.entrySet()){
                System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
                if(entry.getValue().equals(name)){
                    //可以判断管理员登录
                    all.put("token","admin");
                }else {
                    all.put("token","editor");
                }
            }
            all.put("status","OK");
            return new AssembleResponseMsg().success(all);
        }else {
            return new AssembleResponseMsg().failure(200,"error","用户名或密码错误");
        }

    }
}
