package com.cs4520.brainflex.dao

import androidx.lifecycle.Transformations

class UserRepository(private val userDao: UserDao): UserRepo{

    val recent = userDao.getRecent()

    override fun add(user: UserEntity) {
        userDao.add(user)
    }

    override fun getCurrent(): UserEntity? {
        val curr = userDao.getCurrent()
        if(curr.isEmpty()) {
            println("No current user")
            return null
        }
        return curr[0]
    }
}