package com.test

import org.glassfish.jersey.server.ResourceConfig
import sun.nio.cs.FastCharsetProvider
import java.util.logging.Logger

class TestApplication: ResourceConfig() {

    init {
        packages("com.text.service")

        register(FastCharsetProvider::class)//添加默认的Jackson解析器
        //注册日志打印输出
        register(Logger::class)
    }

}