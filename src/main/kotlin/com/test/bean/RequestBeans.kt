package com.test.bean

import java.io.Serializable
import javax.ws.rs.QueryParam
import javax.xml.bind.annotation.XmlRootElement

object RequestBeans {

    data class LoginBean(
            @QueryParam("userId")
            var userId: String? = null,
            @QueryParam("passWord")
            var passWord: String? = null
    ): Serializable

}