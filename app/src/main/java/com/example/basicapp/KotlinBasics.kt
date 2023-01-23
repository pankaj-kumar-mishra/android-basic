package com.example.basicapp

import androidx.core.util.rangeTo
import kotlin.random.Random

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
//    listDatatype()
//    operators()
//    inputValue()
//    flowControl()
//    simpleProjects()
}

const val pie = 3.14// const val (we can use it as global constant)
fun varVsVal() {
    var a = 10// var let
    var b = 20
    b = 15
    println(a + b)
    val c = 5
//    c = 10// throw error (c is const(val))
    println(pie)
}

fun datatypeList() {
//    There are some restriction (ranges). we need to follow
    var a: Boolean = true
    var b: Char = 'P'
    var c: Byte = 12
    var d: Short = 543
    var e: Int = 43567
    var f: Long = -567384767L
    var g: Float = 5.45478454F
    var h: Double = 5.565755453434343
    println(a::class.java)
    println(h::class.java)
}

fun typeConversion() {
    /*toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble()*/
    var a: Byte = 110
    var b: Int = a.toInt()
    var c: Double = b.toDouble()
    println(a)
    println(b)
    println(c)
    var d: Double = 130.456
    var e: Int = d.toInt()
    var f: Byte = e.toByte()
    println(d)
    println(e)
    println(f)
}

fun stringDatatype() {
    var a: String = "Hello Kotlin"
    var b: String = "Language"
    println(a + " " + b)
    var age: Int = 25
    println("Your age is " + age)
    var c: String = "Kotlin"
    var cLen = c.length
    println("The word " + c + " length is " + cLen)
    println("The word $c length is $cLen")// template literal
    println("The word $c length(+10) is ${cLen + 10}")// template literal
    var d: String = "Pankaj"
    var e: Boolean = d.equals("PaNkaJ")// case sensitive
    println(e)
    println(d.isEmpty())
    println(d.plus(" Mishra"))
    println(d.lowercase())
    println(d.uppercase())
    println("   Android   ".trim())
    println("Welcome   Android   Kotlin".trim())
    var f = "pankaj"
    println(f.replaceFirstChar { f[0].uppercase() })// capitalize deprecated
    println(f.substring(2))
    println(f.substring(2, 4))
}

fun arrayDatatype() {
    var names: Array<String> = arrayOf("Pankaj", "Kumar", "Mishra")
    println(names.indexOf("Kumar"))
    println("1st Element " + names[0])
    println("2nd Element " + names.get(1))
//    println("4th Element "+names[3])// it will throw error (no item exists)
    println("3rd Element " + names[2])
//    to update
    names.set(1, "Ku.")
//    names.set(3,"Welcome")// it will throw error (we can't add using "set")
    println("After update " + names.get(0) + " " + names.get(1) + " " + names.get(2))
    println(names.size)
    println("========================")
    var nameWithAga = arrayOf("Pankaj", 25)
    println("Name with Age Supports multi types i,e " + nameWithAga[0] + " " + nameWithAga[1])
}

fun arrayListDatatype() {
    var names = arrayListOf<String>("Pankaj", "Kumar", "Mishra")
    println("1st Element ${names[0]}.")// template literal string
    println("2nd Element ${names.get(1)}.")
//    println("4th Element "+names[3])// it will throw error (no item exists)
    println("3rd Element " + names[2])
//    to update
    names.set(1, "KU")
    println("After update (set) " + names.get(0) + " " + names.get(1) + " " + names.get(2))
//    names.add(1,"Ku.")// add will insert and set will update
    names.add(3, "Welcome")// names.add("Welcome") also work
    names.add("Back")
    println(
        "After insert (add) " + names.get(0) + " " + names.get(1) + " " + names.get(2) + ", " + names.get(
            3
        ) + " " + names.get(4)
    )
    println(names.size)
//    println("========================")
    var nameWithAga = arrayListOf<Any>("Pankaj", 25)
    println("Name with Age Supports multi types i,e " + nameWithAga[0] + " " + nameWithAga[1])
}

fun setDatatype() {
    println("Set is same as Arraylist but only unique value")//same as JS
    var multiTextArray = arrayListOf<Any>("Pankaj", 25, 'X', 6.5, 'X')
    println(multiTextArray.size)//5
    println(multiTextArray.last())//'X'
    var multiTextSet = setOf<Any>("Pankaj", 25, 'X', 6.5, 'X')
    println(multiTextSet.size)//4 (extra 'x' removed)
    println(multiTextSet.last())//6.5
    println(multiTextSet.indexOf('X'))//2
}

fun mapDatatype() {
//    var nameAge = mapOf<String,Int>("Pankaj" to 25,"Mishra" to 26)//key can be array same as JS
    var nameAge = mapOf<String, Int>(Pair("Pankaj", 25), Pair("Mishra", 26))//Pair() or to
    println(nameAge["Pankaj"])
    println(nameAge["mishra"])//null (case sensitive)
    println(nameAge["Mishra"])
    println(nameAge.get("Mishra"))
//    nameAge.put()// put method will work on "mutableMapOf"
    println("========================")
    var nameAgeMutable =
        mutableMapOf<String, Int>("Pankaj" to 25, "Mishra" to 26)//key can be array same as JS
    println(nameAgeMutable["Pankaj"])
    println(nameAgeMutable["mishra"])//null (case sensitive)
    println(nameAgeMutable.get("Mishra"))
    nameAgeMutable.put("Kumar", 27)
    println(nameAgeMutable.get("Kumar"))
}

fun listDatatype() {
    var a = listOf<String>("A", "B", "C", "D")
//    a.add()// only possible for mutableListOf
    println(a)
    var b = mutableListOf<String>("A", "B", "C", "D")
    b.add("E")
    b.add(2, "F")
    println(b)
    val c = mutableListOf<String>("X", "Y", "Z")
    b.removeAt(2)
    b.addAll(c)
    println(b)
    println(b.contains("Y"))
}

fun operators() {
    var a = 'a'..'z'
    var b = 'A'.rangeTo('Z')
    println(a + b)
    var c = 1.rangeTo(30)
    var d = 1..30
    println(c + d)
    var e = 30.downTo(1)
    println(e)
    println('K' in "Pankaj")//false (case sensitive)
    println('k' in "Pankaj")//true
    println('K' in a)//false
    println('K' in b)//true
}

fun inputValue() {
//    1
    /*print("What is your name? ")
    var name:String? = readLine()
    print("What is your age? ")
    var age:Int = readLine()!!.toInt()
    println("Your name is $name and you are $age years old.")*/
//    2
//    print("Enter any number: ")
//    var no = readLine()// readLine()?:"" then we can print like "no.toInt()"
//    println(no?.toInt()?.plus(10))// no.toInt()
//    3
    /*var name:String? = "Pankaj"
    name = null
    println(name?.length)
    var num:Int? = 10
    println(num?.plus(5))
    println(num?.minus(5))
    println(num?.times(5))
    println(num?.div(5))
    println(num?.rem(5))
//    Elvish Operator (?:"") default Value
//    print("Your name please! ")
//    var a:String = readLine()?:"Pankaj"
    var b:String? = null//"Pankaj"
    b = b?:"PKM"
    println(b)*/
//    4 Error Handling
    var c: String? = null//"Pankaj"
    try {
        println(c!!.length)//non nullable assertion
    } catch (err: Exception) {
        println("Error is " + err)
    } finally {
        println("Execution completed!")
    }
}

fun flowControl() {
//    1 => if else
    /*print("Are you hungry? ")
    var a = readLine()?:""
    val isHungry:Boolean = a.toBoolean()
    if(isHungry){
        println("You can eat.")
    } else {
        println("You, please wait for sometimes.")
    }*/
//    2 => for loop
    /*var listData = listOf<String>("A", "B", "C", "D", "E", "F")
    println(listData)
    for (item in listData) {
        println("list: " + item)
    }
    for (item in 1..10) {
        println("number upward: " + item)
    }
    for (item in 10.downTo(1)) {
        println("number downward: " + item)
    }
    for (item in 1..10 step 3) {
        println("number with step 3: " + item)
    }

    var mapData =
        mapOf<String, String>(Pair("P", "Pankaj"), Pair("K", "Kumar"), Pair("M", "Mishra"))
    println(mapData)
    for (item in mapData.keys) {//keys => values
        println("map: key $item and value ${mapData[item]}")
    }

    var arrayData = arrayListOf<String>("A", "B", "C", "D", "E", "F")
    println(arrayData)
    for (item in arrayData) {
        println("array: " + item)
    }

    for (i in 1..5) {
        for (j in 1..i) {
            print("😇")
        }
        println("")
    }*/
//    3 => while loop
    /*var i = 0
    while (i<=5){
        println("while: "+i)
        i++
    }
    var j = 5
    while (j>=0){
        println("while reverse: "+j)
        j--
    }

    val limit = 5
    var k = 0
    var total = 0
    while (k<=limit) {
        total+=k
        k++
    }
    println(total)*/
//    4 => do while (it will run minimum 1 time (whether condition matched or not))
    /*var i = 0
    do {
        println("false Condition: $i")
    }while (i>5)
    var j = 0
    do {
        println("true Condition: $j")
        j++
    }while (j<5)*/
//    5 => when (switch case)
    /*print("Enter a character: ")
    var text = readLine() ?: ""
    when (text) {
        "a" -> {
            println("You entered $text. Apple")
        }
        "b" -> {
            println("You entered $text. Ball")
        }
        "c" -> {
            println("You entered $text. Cricket")
        }
        else -> {
            println("You entered $text. Not Available")
        }
    }
    print("Enter hour between (6-24): ")
    val a = readLine() ?: ""
    val hour = a.toInt()
    when (hour) {
        in 6..12 -> {
            println("Good Morning")
        }
        in 12..18 -> {
            println("Good Afternoon")
        }
        in 18..24 -> {
            println("Good Evening")
        }
        else -> {
            println("Good Night!")
        }
    }*/
}

fun simpleProjects() {
//  1 => Guess Number
    /*val randomNum = Random.nextInt(1, 5)
    println("RandomNum: $randomNum")
    var i = 0
    while (i < 3) {
        print("Enter a number: ")
        val input = readLine() ?: ""
        i++
        if (input.toInt() === randomNum) {
            println("You Won!")
            i = 3//to end game
        } else if (i === 3) {
            println("You Lose!!")
        } else {
            println("Please can try ${3 - i} times more.")
        }
    }*/
//    2 => ATM Machine
    println("Welcome to ATM Machine")
    println("Enter 1 for Check Balance")
    println("Enter 2 for Deposit Money")
    println("Enter 3 for Withdraw Money")
    println("Enter 4 for Cancel/Exit ATM Machine")
    var currentBalace = 10000
    print("Please choose an option: ")
    val input = readLine()?:""
    val choice = input.toInt()
    when(choice){
        1 -> {
            println("Your account balance is $currentBalace.")
        }
        2 -> {
            print("Enter amount for deposit.")
            val amt = readLine()?:""
            currentBalace+=amt.toInt()
            println("Your current account balance is $currentBalace.")
        }
        3 -> {
            print("Enter amount for withdraw.")
            val amt = readLine()?:""
            if (currentBalace>=amt.toInt()){
                currentBalace-=amt.toInt()
            } else {
                println("You don't have sufficient balance.")
            }
            println("Your current account balance is $currentBalace.")
        }
        else -> {
            println("Good Bye, Please visit again!")
        }
    }
}