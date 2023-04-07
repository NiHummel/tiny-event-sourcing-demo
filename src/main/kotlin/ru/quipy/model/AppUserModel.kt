package com.itmo.microservices.demo.users.api.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import java.util.*

data class AppUserModel(
        val email: String,
        val name: String,
        val surname: String,
        val aggregateId: UUID,
        @JsonIgnore
        val password: String) {

        fun userDetails(): UserDetails = User(email, password, emptyList())
}
