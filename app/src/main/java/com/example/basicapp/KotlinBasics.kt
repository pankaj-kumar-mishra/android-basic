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
//    listDatatype()
//    operators()
//    inputValue()
//    flowControl()
//    simpleProjects()
//    functionsDiff()

//    OOPs concepts
//    songFunction()
//    inheritanceFunction()
//    polymorphismFunction()
//    abstractionFunction()
//    encapsulationFunction()
//    constructorFunction()

//    Interface Concepts
//    interfaceFunction()

//    Standard Function
//    scopeFunction()

//    Other types of class
//    otherClassFunction()
//    otherConceptsFunction()

//    Small Projects
//    quizApp()
//    shopBillApp()
//    salarySheetApp()
//    studentResultApp()
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
    val input = readLine() ?: ""
    val choice = input.toInt()
    when (choice) {
        1 -> {
            println("Your account balance is $currentBalace.")
        }
        2 -> {
            print("Enter amount for deposit.")
            val amt = readLine() ?: ""
            currentBalace += amt.toInt()
            println("Your current account balance is $currentBalace.")
        }
        3 -> {
            print("Enter amount for withdraw.")
            val amt = readLine() ?: ""
            if (currentBalace >= amt.toInt()) {
                currentBalace -= amt.toInt()
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

fun functionsDiff() {
    /*println(sum(10, 15))//arguments
    println(sum(b = 5, a = 10))//named arguments function
//    "show" same named function will call according to arguments we pass and it's types
    show("Pankaj")//call show string parameter one
    show(100)//call show integer parameter one
    show(80, 70)//call show integer parameter two*/
}

fun sum(a: Int, b: Int): Int {//parameters
    return a + b
}

//Function Overloading
fun show(p1: String) {
    println("show string: $p1")
}

fun show(p1: Int) {
    println("show Int: $p1")
}

fun show(p1: Int, p2: Int) {
    println("show p1 Int: $p1 and p2 Int: $p2")
}

// OOPs Concepts
fun songFunction() {
    /*val song1 = Song()
    song1.name = "Song One"
    song1.singer = "Singer One"
    song1.duration = 5.30
    song1.onTSeries = false
    println(song1.name)
    song1.play()
    song1.stop()*/
    val song1 = Song("Song One", 5.30, "Singer One", false)
    song1.play("Pankaj")
}

class Song(name: String, duration: Double, singer: String, onTSeries: Boolean) {
//    var name:String? = null
//    var duration:Double? = null
//    var singer:String? = null
//    var onTSeries:Boolean? = null

    fun play(name: String) {
        println("$name Song is playing...")
    }

    fun stop() {
        println("Song is stopped.")
    }

    fun pause() {
        println("Song is paused.")
    }
}

/* Main OOPs Concepts
* Inheritance
* Polymorphism
* Abstraction
* Encapsulation
* */
// 1 => Inheritance
fun inheritanceFunction() {
//    val pankaj = Pankaj()
//    pankaj.name
}

/*open class Person() {// to inherit parent class you need to "open" the class
    var name:String? = null
    var height:String? = null
    var fatherName:String? = null
    var surName:String? = null
}
//class Pankaj() {
class Pankaj(): Person() {
    var canDance:Boolean? = null
}
class PKM(): Person() {
    var canSing:Boolean? = null
}*/

// 2 => Polymorphism
fun polymorphismFunction() {
//    val add = Add(10, 5)
//    println(add.calculate())
//    val multi = Multi(10, 5)
//    println(multi.calculate())
}

/*open class ParentCalculations() {
    open fun calculate():Int {
        println("Parent Calculate")
        return  0
    }
}
class Add(val a:Int,val b:Int): ParentCalculations() {
    override fun calculate():Int {
        return a + b
    }
}
class Multi(val a:Int, val b:Int): ParentCalculations() {
    override fun calculate():Int {
        return a * b
    }
}*/

// 3 Abstraction
fun abstractionFunction() {
//    we can't make instance of abstract class
//    val sum = Add2(10)
//    sum.print()
//    println(sum.calculation())
//    val multi = Multi2(10)
//    multi.print()
//    println(multi.calculation())
}

abstract class AbsParent() {
    abstract fun print()
    abstract fun calculation(): Int
}
/*class Add2(val a: Int):AbsParent() {
    override fun print() {
        println("Add2 Printing $a")
    }
    override fun calculation(): Int {
        return a + a
    }
}
class Multi2(val a: Int):AbsParent() {
    override fun print() {
        println("Multi2 Printing $a")
    }
    override fun calculation(): Int {
        return a * a
    }
}*/

// 4 => Encapsulation
fun encapsulationFunction() {
//    val pankaj = Pankaj()
//    pankaj.doWork()
}

/*open class Person() {
    val name:String = "Welcome"
//    private val name:String = "Welcome"// we can't use this variable (Pankaj or PKM) class
//    protected val name:String = "Welcome"// we need to use "super.name"
    fun work() {
        println("Playing Cricket")
    }
}
class Pankaj(): Person() {
    fun doWork() {
        println("Parent Name: $name")
        work()
    }
}*/

// ==> Constructor Class
fun constructorFunction() {
    /*val test = PrimaryConstructor("Pankaj",25)
    val test2 = SecondaryConstructor("Pankaj", 25)
    println(test2.sum(10,5))
    val test3 = ThisTest()
    println("Before name: "+test3.name)
    test3.updateName("Pankaj")
    println("After name: "+test3.name)
    val test4 = GetSetTest()
    println("Before set "+ test4.name)
    test4.name = "Pankaj Mishra"
    println("After set "+ test4.name)*/
}

/*class PrimaryConstructor(name: String, age: Int) {
    init {
        println("Primary: I am $name and my age is $age.")
    }
}
class SecondaryConstructor(name: String, age: Int) {
    init {
        println("Secondary: I am $name and my age is $age.")
    }

    fun sum(val1:Int, val2:Int):Int {
        return val1 + val2
    }
}
class ThisTest() {
    var name:String = "No Name"
    fun updateName(newName:String) {
        this.name = newName
    }

//    companion object
//    this can accessible in separate class by using import "className.companion.API_KEY"
    companion object {
        val API_KEY:String = "pankajApiKey=123hello==welcome"
    }
}

// Getter Setter Class
class GetSetTest() {
    var name: String = "Default Name"
    get() = field
    set(value:String) {
        if (value?.length>4) {
            field = value
        } else {
            println("Please enter minimum 4 characters.")
        }
    }
}*/

// ==> INTERFACE
fun interfaceFunction() {
    /*val stud1 = Pankaj()
    stud1.readBook("Rich Dad Poor Dad")
    stud1.reading()
    stud1.writing()*/
}

/*interface Student {
    val name:String
    fun reading()
    fun writing()
    fun readBook(name:String) {
        println("Student is Reading $name Book.")
    }
}
class Pankaj: Student{
    override val name: String = "Mobile Development"

    override fun reading() {
        println("Pankaj is Reading.")
    }

    override fun writing() {
        println("Pankaj is Writing.")
    }
}*/

// Standard Functions (Scope Function) => (let, run, with, apply, also)
fun scopeFunction() {
    val name: String = "Pankaj"
    val lists = listOf<String>("A", "B", "C")
    val test = ScopeTest()
//    let
    println("varName.let")
    name.let {
        println(it.length)
        println(it.uppercase())
    }
    lists.let { it2 ->// by default "it" we can use custom one "newName->" (-> lambda function)
        println(it2.size)
        println(it2.get(1))
    }
    test.let {
        it.first()
        it.second()
    }
//    with => in "with" we can return but in "let" we can't
    println("=======================with(varName)")
//    by default "this", we can't change it
    with(name) {
        println(this.length)
        println(this.uppercase())
        "string type"
    }
    with(lists) {
        println(this.size)
        println(this.get(1))
        "list type"
    }
    with(test) {
        this.first()
        this.second()
    }
//    also => we can use with "let" or "with"
    println("=======================with(varName){}.also{}")
    with(lists) {
        for (i in this) {
            println("for: $i")
        }
    }.also {
        println("List printed successfully")
    }
//    apply => same as with
    println("=======================varName.apply {}")
    lists.apply {
        println("apply: $this")
    }
    //    run => same as with
    println("=======================varName.apply {}")
    lists.run {
        println("run: $this")
    }
}

class ScopeTest() {
    fun first() {
        println("first called")
    }

    fun second() {
        println("second called")
    }
}

// ==> Other Types of Class (Data, Enum, Sealed, Nested Inner)
fun otherClassFunction() {
/*//    1 => data class
    var lists = arrayListOf<Developer>()
    lists.add(Developer("Pankaj","Mishra",25,"RN Developer"))
    lists.add(Developer("PKM","Mishra",26,"Android Developer"))
    for (item in lists) {
        println(item)
    }
//    2 => enum class
    val myGender:Gender = Gender.MALE
//    3 => sealed class (multiple classes types assigned to a one type "TypesOfVehicle")
    val bmw:TypesOfVehicle = Car("BMW")
    val hero:TypesOfVehicle = Bike("Hero", 50000.00)
//    4 => Nested or Inner class (Parent.Child() or Parent().Child())
    val animal = Animal()
    animal.test
//    nested class
    val dog = Animal.Dog()
    dog.work()
//    inner class
    val fish = Animal().Fish()
    fish.work()*/
}

/*data class Developer (
    var firstName:String = "",
    var lastName:String = "",
    var age:Int = 0,
    var profession:String = ""
)
enum class Gender {
    MALE,FEMALE,OTHER
}
sealed class TypesOfVehicle
class Car(val name:String): TypesOfVehicle() {
    val test:String = "Outer test variable"
}
class Bike(val name:String, val price:Double): TypesOfVehicle()
class Animal() {
    val test:String = "Outer test variable"
    class Dog() {
        fun work() {
            println("Dog is barking.")
        }
    }
    inner class Fish() {
        fun work() {
            println("Fish is swimming.")
        }
    }
}*/

fun otherConceptsFunction() {
/*//    1 => late_init var
    val name = Names()
    name.Pankaj()
    name.Mishra()
//    2 => type_checking
    println("" is String)
    println(name is Names)
//    3 => smart_casting (auto detect types)
    val arrStr = arrayOf("P","K")//Array<String>
    val arrInt = arrayOf(10,20)//Array<Int>*/
}

/*class Names() {
    lateinit var name:String
    fun Pankaj() {
        name = "Pankaj"
        println("Hello $name")
    }
    fun Mishra() {
        name = "Mishra"
        println("Hello $name")
    }
}*/

// ==========================Small Projects
// 1 =====> Quiz APP
fun quizApp() {
    println("Welcome to Quiz App")
    var quizs = arrayListOf<Question>()
    quizs.add(
        Question(
            "Question 1",
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 3"
        )
    )
    quizs.add(
        Question(
            "Question 2",
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 1"
        )
    )
    quizs.add(
        Question(
            "Question 3",
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 2"
        )
    )

    print("Press 1 to start or Press 2 to exit. ")
    var rightAns = 0
    var wrongAns = 0
    val a = readLine() ?: ""

    when (a.toInt()) {
        1 -> {
            for (item in quizs) {
                println("Question : ${item.question}")
                println("OptionA: ${item.option1}")
                println("OptionB: ${item.option2}")
                println("OptionC: ${item.option3}")
                println("OptionD: ${item.option4}")
                println("--------------Please enter your answer--------------------")
                val ans = readLine() ?: ""
//                if (ans === item.answer) {
//                if (ans.lowercase().equals(item.answer.lowercase())) {
                if (ans.lowercase().equals(item.answer.lowercase())) {
                    rightAns++
                    println("Correct Answer")
                } else {
                    wrongAns++
                    println("InCorrect Answer")
                }
            }

            println("You gave $rightAns Correct Answers")
            println("You gave $wrongAns Wrong Answers")
            println("Thank You, Welcome Back")
        }
        2 -> {
            println("Good bye")
        }
        else -> {
            println("Good bye")
        }
    }
}

data class Question(
    val question: String = "",
    val option1: String = "",
    val option2: String = "",
    val option3: String = "",
    val option4: String = "",
    val answer: String = ""
)

// 2 =====> Shop Bill App
fun shopBillApp() {
    println("Welcome to Toy Shop")
    var products = arrayListOf<ShopProduct>()
    products.add(ShopProduct("Bat", 500.00))
    products.add(ShopProduct("Ball", 50.00))
    products.add(ShopProduct("Stump", 200.00))
    println("Available Products: ")
    for (item in products) {
        println("${item.name} price is ${item.price}")
    }
    println("What you want to purchase? ")
    val prod = readLine() ?: ""
    println("How many $prod you want to buy? ")
    val qty = readLine() ?: "1"
    val prodIdx = products.indexOfFirst {
        it.name.lowercase() == prod.lowercase()
    }
    println("$prod ====== $prodIdx ==> $qty")
    if (prodIdx != -1) {
        try {
            val price = products[prodIdx].price
            val totalPrice = price * qty.toInt()
            println("Your billing price is $totalPrice")
        } catch (err: Exception) {
            println(err)
        }
    } else {
        println("Sorry, $prod is not available.")
    }
}

data class ShopProduct(
    val name: String = "",
    val price: Double = 0.00
)

// 3 =====> Salary Sheet App
fun salarySheetApp() {
    print("Enter your salary? ")
    val sal = (readLine() ?: "").toInt()
    val da = sal * .10
    val ma = 300
    val hra = sal * .075
    val pf = sal * .125
    val grossSal = sal + da + ma + hra
    val netSal = grossSal - pf
    println("DA: $da, MA: $ma, HRA: $hra, PF: $pf, Gross Salary: $grossSal")
    println("Your salary is $sal and your net salary is $netSal.")
}

// 4 =====> Student Result App
fun studentResultApp() {
    val students = arrayListOf<StudentResult>()

    for (item in 1..3) {
        print("Enter your name? ")
        val name = readLine() ?: ""
        print("Enter your mark (Subject One): ")
        val s1 = (readLine() ?: "").toInt()
        print("Enter your mark (Subject Two): ")
        val s2 = (readLine() ?: "").toInt()
        print("Enter your mark (Subject Three): ")
        val s3 = (readLine() ?: "").toInt()
        val total = s1 + s2 + s3
        val percentage = (total / 3).toDouble()

        students.add(StudentResult(name, s1, s2, s3, total, percentage ))
    }
    println("Students: $students")
}

data class StudentResult(
    val name: String = "",
    val s1: Int = 0,
    val s2: Int = 0,
    val s3: Int = 0,
    val total: Int = 0,
    val percentage: Double = 0.0
)