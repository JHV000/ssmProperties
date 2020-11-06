package com.leave.common;

import com.leave.model.InfoMsg;
import com.leave.model.ResponseBody;


/**
 * 封装ResponseBody的内容
 */
public class AssembleResponseMsg {
    public <T> ResponseBody success(T data){
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info = new InfoMsg();
        resp.setInfo(info);
        return  resp;
    }

    public <T> ResponseBody failure(int status,String errorCode,String errMsg){
        ResponseBody<T> resp = new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info = new InfoMsg();
        info.setCode(errorCode);
        info.setMsg(errMsg);
        resp.setInfo(info);
        return  resp;
    }
}
