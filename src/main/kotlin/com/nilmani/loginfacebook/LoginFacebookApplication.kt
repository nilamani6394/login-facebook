package com.nilmani.loginfacebook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableOAuth2Sso
class LoginFacebookApplication

fun main(args: Array<String>) {
	runApplication<LoginFacebookApplication>(*args)
}
