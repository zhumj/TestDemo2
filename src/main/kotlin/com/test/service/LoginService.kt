package com.test.service

import com.test.bean.RequestBeans
import com.test.bean.ResultBeans
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/user")
class LoginService {

    @GET
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)   //指定请求接收的响应体为JSON
    @Produces(MediaType.APPLICATION_JSON)   //指定请求返回的响应体为JSON
    fun get(@BeanParam loginRequest: RequestBeans.LoginBean): ResultBeans.BaseBean<ResultBeans.UserInfo> {
        val result = ResultBeans.BaseBean<ResultBeans.UserInfo>()
        val userInfo = ResultBeans.UserInfo()
        if (loginRequest.userId.isNullOrEmpty()) {
            result.message = "请输入账号"
        } else if (loginRequest.passWord.isNullOrEmpty()) {
            result.message = "请输入密码"
        } else {
            result.code = 1
            result.message = "登陆成功"
            userInfo.userId = loginRequest.userId
            userInfo.passWord = loginRequest.passWord
        }
        result.result = userInfo
        return result
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)   //指定请求接收的响应体为JSON
    @Produces(MediaType.APPLICATION_JSON)   //指定请求返回的响应体为JSON
    fun post(@BeanParam loginRequest: RequestBeans.LoginBean): ResultBeans.BaseBean<ResultBeans.UserInfo> {
        val result = ResultBeans.BaseBean<ResultBeans.UserInfo>()
        val userInfo = ResultBeans.UserInfo()
        if (loginRequest.userId.isNullOrEmpty()) {
            result.message = "请输入账号"
        } else if (loginRequest.passWord.isNullOrEmpty()) {
            result.message = "请输入密码"
        } else {
            result.code = 1
            result.message = "登陆成功"
            userInfo.userId = loginRequest.userId
            userInfo.passWord = loginRequest.passWord
        }
        result.result = userInfo
        return result
    }

//    @GET
//    @Path("/login")
//    @Consumes(MediaType.APPLICATION_JSON)   //指定请求接收的响应体为JSON
//    @Produces(MediaType.APPLICATION_JSON)   //指定请求返回的响应体为JSON
//    fun get(): ResultBeans.BaseBean<ResultBeans.UserInfo> {
//        return ResultBeans.BaseBean<ResultBeans.UserInfo>(1, "登陆成功", ResultBeans.UserInfo("123", "123"))
//    }
//
//    @POST
//    @Path("/login")
//    @Consumes(MediaType.APPLICATION_JSON)   //指定请求接收的响应体为JSON
//    @Produces(MediaType.APPLICATION_JSON)   //指定请求返回的响应体为JSON
//    fun post(): ResultBeans.BaseBean<ResultBeans.UserInfo> {
//        return ResultBeans.BaseBean<ResultBeans.UserInfo>(1, "登陆成功", ResultBeans.UserInfo("123", "123"))
//    }

}