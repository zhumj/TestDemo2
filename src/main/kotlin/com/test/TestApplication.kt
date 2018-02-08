package com.test

import org.glassfish.jersey.server.ResourceConfig
import sun.nio.cs.FastCharsetProvider
import java.util.logging.Logger

class TestApplication: ResourceConfig() {

    init {
        packages("com.text.service")

        register(FastCharsetProvider::class)
        register(Logger::class)
    }

}