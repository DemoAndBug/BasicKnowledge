package com.simon.kotlin.standard

import com.simon.kotlin.bean.Users

/**
 * also函数：返回值 = 传入的对象的本身
 */
fun main() {
    val user = Users()
    user.name = "simon"
    user.surname = "ren"
    user.email = "simon@gmail.com"
    val result = user.also { it ->
        println(it)
        println(it.name)
        println("${it.email}one")
        it.isEmail = true
        it.email = "ren@gmail.com"
        println("${it.email}two")
        test()
    }
    println(result)
}




