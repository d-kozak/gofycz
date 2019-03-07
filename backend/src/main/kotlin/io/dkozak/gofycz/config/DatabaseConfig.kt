package io.dkozak.gofycz.config

import org.apache.commons.dbcp.BasicDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.net.URI

@Configuration
class DatabaseConfig{

    @Bean
    fun dataSource(): BasicDataSource {
        val dbUri = URI(System.getenv("DATABASE_URL"))

        val (username, password) = dbUri.userInfo.split(":")

        val dbUrl = "jdbc:postgresql://${dbUri.host}:${dbUri.port}${dbUri.path}?sslmode=require"

        return BasicDataSource().apply {
            this.url = dbUrl
            this.username = username
            this.password = password
        }
    }
}