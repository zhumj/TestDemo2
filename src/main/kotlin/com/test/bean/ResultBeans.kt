package com.test.bean

import java.io.Serializable

object ResultBeans {

    data class BaseBean<T>(
            var code: Int = 0,
            var message: String? = null,
            var result: T? = null
    ): Serializable

    data class UserInfo(
            var userId: String? = null,
            var passWord: String? = null
    ): Serializable

}