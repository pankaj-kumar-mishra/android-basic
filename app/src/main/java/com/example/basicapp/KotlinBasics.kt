package com.example.basicapp

// Only Basics
fun main(args: Array<String>) {
//    varVsVal()
//    datatypeList()
//    typeConversion()
//    stringDatatype()
//    arrayDatatype()
//    arrayListDatatype()
//    setDatatype()
//    mapDatatype()
//    operators()
//    inputValue()
}

fun varVsVal(){
    var a = 10// var let
    var b = 20
    b= 15
    println(a+b)
    val c = 5
//    c = 10// throw error (c is const(val))
}
fun datatypeList(){
//    There are some restriction (ranges). we need to follow
    var a:Boolean = true
    var b:Char = 'P'
    var c:Byte = 12
    var d:Short = 543
    var e:Int = 43567
    var f:Long = -567384767L
    var g:Float = 5.45478454F
    var h:Double = 5.565755453434343
}
fun typeConversion(){
    /*toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()*/
    var a:Byte = 110
    var b:Int = a.toInt()
    var c:Double = b.toDouble()
    println(a)
    println(b)
    println(c)
    var d:Double = 130.456
    var e:Int = d.toInt()
    var f:Byte = e.toByte()
    println(d)
    println(e)
    println(f)
}
fun stringDatatype(){
    var a:String = "Hello Kotlin"
    var b:String = "Language"
    println(a+" "+b)
    var age:Int = 25
    println("Your age is "+age)
    var c:String = "Kotlin"
    var cLen = c.length
    println("The word "+c+" length is "+cLen)
    var d:String = "Pankaj"
    var e:Boolean = d.equals("PaNkaJ")// case sensitive
    println(e)
    println(d.isEmpty())
    println(d.plus(" Mishra"))
    println(d.lowercase())
    println(d.uppercase())
    println("   Android   ".trim())
    println("Welcome   Android   Kotlin".trim())
}
fun arrayDatatype(){
    var names:Array<String> = arrayOf("Pankaj","Kumar","Mishra")
    println("1st Element "+names[0])
    println("2nd Element "+names.get(1))
//    println("4th Element "+names[3])// it will throw error (no item exists)
    println("3rd Element "+names[2])
//    to update
    names.set(1,"Ku.")
//    names.set(3,"Welcome")// it will throw error (we can't add using "set")
    println("After update "+names.get(0)+" "+names.get(1)+" "+names.get(2))
    println(names.size)
    println("========================")
    var nameWithAga = arrayOf("Pankaj",25)
    println("Name with Age Supports multi types i,e "+ nameWithAga[0] + " "+ nameWithAga[1])
}
fun arrayListDatatype(){
    var names = arrayListOf<String>("Pankaj","Kumar","Mishra")
    println("1st Element ${names[0]}.")// template literal string
    println("2nd Element ${names.get(1)}.")
//    println("4th Element "+names[3])// it will throw error (no item exists)
    println("3rd Element "+names[2])
//    to update
    names.set(1,"KU")
    println("After update (set) "+names.get(0)+" "+names.get(1)+" "+names.get(2))
//    names.add(1,"Ku.")// add will insert and set will update
    names.add(3,"Welcome")// names.add("Welcome") also work
    names.add("Back")
    println("After insert (add) "+names.get(0)+" "+names.get(1)+" "+names.get(2)+", "+names.get(3)+" "+names.get(4))
    println(names.size)
//    println("========================")
    var nameWithAga = arrayListOf<Any>("Pankaj",25)
    println("Name with Age Supports multi types i,e "+ nameWithAga[0] + " "+ nameWithAga[1])
}
fun setDatatype(){
    println("Set is same as Arraylist but only unique value")//same as JS
    var multiTextArray = arrayListOf<Any>("Pankaj",25,'X',6.5,'X')
    println(multiTextArray.size)//5
    println(multiTextArray.last())//'X'
    var multiTextSet = setOf<Any>("Pankaj",25,'X',6.5,'X')
    println(multiTextSet.size)//4 (extra 'x' removed)
    println(multiTextSet.last())//6.5
}
fun mapDatatype(){
    var nameAge = mapOf<String,Int>("Pankaj" to 25,"Mishra" to 26)//key can be array same as JS
    println(nameAge["Pankaj"])
    println(nameAge["mishra"])//null (case sensitive)
    println(nameAge["Mishra"])
    println(nameAge.get("Mishra"))
//    nameAge.put()// put method will work on "mutableMapOf"
    println("========================")
    var nameAgeMutable = mutableMapOf<String,Int>("Pankaj" to 25,"Mishra" to 26)//key can be array same as JS
    println(nameAgeMutable["Pankaj"])
    println(nameAgeMutable["mishra"])//null (case sensitive)
    println(nameAgeMutable.get("Mishra"))
    nameAgeMutable.put("Kumar",27)
    println(nameAgeMutable.get("Kumar"))
}
fun operators(){
    var a = 'a'..'z'
    var b = 'A'.rangeTo('Z')
    println(a+b)
    var c = 1.rangeTo(30)
    var d = 1..30
    println(c+d)
    println('K' in "Pankaj")//false (case sensitive)
    println('k' in "Pankaj")//true
    println('K' in a)//false
    println('K' in b)//true
}
fun inputValue(){
    print("What is your name? ")
    var name:String? = readLine()
    print("What is your age? ")
    var age:Int = readLine()!!.toInt()
    println("Your name is $name and you are $age years old.")
}
