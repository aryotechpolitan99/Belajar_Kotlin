package com.kelas_coding

class Student {

    //property
    var name : String = ""
    var nim : String = ""
    var jurusan : String = ""

    //fungsi

}
fun main (){

    //instansiasi atau membuat objek
    val object1 = Student()
    val object2 = Student()
    val object3 = Student()

    object1.name = "Ahmad"
    object1.nim = "202101"
    object1.jurusan = "Teknik Informatika"

    object2.name = "Barry"
    object2.nim = "202102"
    object2.jurusan = "Teknik Informatika"

    object3.name = "Cintya"
    object3.nim = "202103"
    object3.jurusan = "Teknik Informatika"

    println("Name : ${object1.name}")
    println("NIM : ${object1.nim}")
    println("Jurusan : ${object1.jurusan}")

    println("Name : ${object2.name}")
    println("NIM : ${object2.nim}")
    println("Jurusan : ${object2.jurusan}")

    println("Name : ${object3.name}")
    println("NIM : ${object3.nim}")
    println("Jurusan : ${object3.jurusan}")
}