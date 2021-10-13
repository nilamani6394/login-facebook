package com.nilmani.loginfacebook.controller

import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class UserController {
    @GetMapping("/")
    fun getUSer(principal: Principal): String? {
        val authDetails = (principal as OAuth2Authentication)
            .userAuthentication
            .details as Map<*, *>
        val userName = authDetails["name"] as String?
        return "Hey $userName, Welcome to Elaunch solution"
    }
}
