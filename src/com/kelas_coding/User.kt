package com.kelas_coding

class User (var userName : String, var passWord : String) { //property class atau variable bisa ditulis pada parameter

   // var username : String = userName
    //var password: String = passWord

}

fun main() {

    val obj1 = User(userName = "Ali", passWord = "1111")

    println("username : ${obj1.userName}")
    println("password : ${obj1.passWord}")
}