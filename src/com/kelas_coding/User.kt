package com.kelas_coding

class User (var userName : String = "Ali", var passWord : String = "1111") { //property class atau variable bisa ditulis pada parameter

   // var username : String = userName
    //var password: String = passWord

}

fun main() {

   val obj1 = User(userName="ali", passWord = "1111")
    val obj2 = User(userName = "Andi")
    val obj3 = User()

    println("username : ${obj1.userName}")
    println("password : ${obj1.passWord}")

    println("username : ${obj2.userName}")
    println("password : ${obj2.passWord}")

    println("username : ${obj3.userName}")
    println("password : ${obj3.passWord}")
}