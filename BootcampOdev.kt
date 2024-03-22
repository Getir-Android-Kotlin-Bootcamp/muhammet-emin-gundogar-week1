fun main() { 
  // Sayfa 9 = print ve println fonksiyonu
    print("merhaba dünya")
    println("iyi akşamlar")
    
    // Sayfa 10 = Fonksiyonlar
    
   fun removeFirstElementFromList(liste: MutableList<Any>) {
       liste.removeAt(0)
   }
   
   val liste = mutableListOf<Any>(1,2,3,4)
   removeFirstElementFromList(liste)
   print(liste)
   
   // Sayfa 11 = Değişkenler
   
   var number1 = 5
   
    val number2 = 3 
   	number1 = 7 // Okey
    
 // Compiler Error   number2 = 6
    
    // Sayfa 12 =  class
    val computer = Computer(16,2)
    computer.printComputer()
    
    // Sayfa 14 = String
    
    val firstString = " Muhammet"
    val secondString = " Gündoğar"
    val fullName = firstString + secondString
   	println(fullName)
    
    // Sayfa 15 = If else
    
    val age = 20
    if(age >= 18){
        println("Ehliyet alabilirsiniz")
    } else {
        println("Ehliyet almak için 18 yaşında olmak zorundasınız")
    }
    
    // Sayfa 16 = For Loop
    var listFor = listOf(1,2,3,4,5)
    println("For Loop")
    for (i in listFor.indices){
        println(i)
    }
    
    // Sayfa 17 = While Loop
    var whileBool = 0
    println("While Loop")
    while(true){
        println(whileBool)
        whileBool++
        if(whileBool == 5){
            break
        }
    }
    
    // Sayfa 18 = When Kullanımı
    var whenNumber = 5
    when(whenNumber){
        3 -> println("when Number is 3")
        5 -> println("when Number is 5")
        else -> println("Number is not 3 or 5")
        
    }
    
    // Sayfa 19 = Range Kullanımı
    
    for(x in 0..5){
        println("Number x is $x")
    }
    
    // Sayfa 20 = Collection metotları
     var familyNames = listOf("Muhammet","Yunus","Ümmihan","Galip")
     var loweredFamilyNames = familyNames.map{name -> name.toLowerCase()}
     println(loweredFamilyNames)
     
     // Sayfa 21 = Null İfadeler
     var nullableInteger: Int? = 5
    println(nullableInteger)
     nullableInteger = null
    println(nullableInteger)
    
    // Sayfa 22 = Tip kontrolü
    var typeCheckNumber = 3
    if(typeCheckNumber is Int){
        println("$typeCheckNumber is an integer")
        
        
    }
    
    // Sayfa 37 data class
    val product = Product("Lahmacun",2)
    val product2 = Product("Kebap",1)
    val product3 = product2.copy(name = "Doner")
    println("Sipariş $product3")
                        
    
    
    // Sayfa 38 = Default Arguments
    
   fun sum(a: Int = 5, b: Int = 3){
       var result = a + b
       println(result)
   }
    sum(4,5)
    sum()
   
  // Sayfa 39 Filter fonksiyonu
	val mixedList = listOf(-5,3,-2,6,8)
    val negatives = mixedList.filter{ it < 0}
    println(negatives)
    
    // Sayfa 40 Koleksiyon in fonksiyonu
    if(3 in mixedList){
        println("3 listede var")
    }
    // Sayfa 41
    var square = Square()
    when(square){
        is Shape -> {println("Kare bir şekildir")}
        else -> {println("Bulunamadı")}
    }
    // Sayfa 43 mapler
    val map = hashMapOf("1" to "bir", "2" to "iki","3" to "üç")
    println(map["1"])
    
    // Sayfa 44 for loop map
    
    for((k,v) in map){
        println("$k -> $v")
    }
    
    // Sayfa 45 Lazy 
    val myLazyInteger: Int by lazy{
        println("Lazy İlk defa çağrıldığında burası çalışacak ")
        5
        
    }
    println(myLazyInteger)
    
    // Sayfa 46 Extension fonksiyonlar
    fun String.removeFirstAndLastChar() = this.substring(1,this.length-1)
   	println("muhammet".removeFirstAndLastChar())
    
    // Sayfa 47 = Singleton
   println(MuhammetSingleton.name)
   
   // Sayfa 48 = Abstract Class
   
   var telefon = AkilliTelefon()
   telefon.cagriYap()
   
   var nokia = Nokia()
   nokia.mesajAt()
   
   // Sayfa 49 If not null shorthand
   val nullableString : String? = null
   println(nullableString?.removeFirstAndLastChar()) 
    
    // Sayfa 50 Elvis operator
   
   var nullableString2: String? = null
val result = nullableString2 ?: "default"
println(result) 


// Sayfa 51 throw exception
nullableString2 = "Muhammet"
nullableString2 ?: throw Exception("Something went Wrong")

// Sayfa 52 = Liste erişim
val phones = listOf("Iphone","Samsung","Huawei")
println(phones.lastOrNull() ?: "Samsung")

// Sayfa 53 = Let ifadesi
nullableString2?.let{
    println("string null değil")
}

// Sayfa 54 = gelişmiş let ifadesi
nullableString2 = null
nullableString2?.let{
    println("string null değil")
} ?: println("String null döndürüyor")

// Sayfa 55 = Geri ifade döndüren when
fun evaluateGrade(score: Int): String {
    return when {
        score >= 90 -> "AA"
        score >= 80 -> "BA"
        score >= 70 -> "BB"
        score >= 60 -> "CB"
        score >= 50 -> "CC"
        else -> "FF"
    }
}
println(evaluateGrade(75))

// Sayfa 56 Try catch
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        -1 
    }
}
divide(10,0) // Exception vermeyip error mesajını döndürür
divide(5,2) // 2 döndürür

// Sayfa 58 If değişkene atama
var input = 3
val answer = when (input) {
    3 -> "Three"
    4 -> "Four"
    else -> "other"
}
println(answer)

// Sayfa 59 Apply Scope Fonksiyonu
fun createArrayOfOnesFromMiddle(size: Int): IntArray {
    return IntArray(size).apply { fill(1,this.size / 2,this.size) }
    
}
var new = createArrayOfOnesFromMiddle(10)
for (i in new){
    println(i)
}

// Sayfa 60 short function
fun shortFun() = 12
fun longFun(): Int{
    return 12
}    
println(longFun())
println(shortFun())

// Sayfa 62 = Birden çok öge değiştirme
MuhammetSingleton.apply{
    name = "Yunus"
    password = "123"
}
println(MuhammetSingleton.name)
println(MuhammetSingleton.password)

// Sayfa 63 = use fonksiyonu
// val fileName = "example.txt"

//     BufferedReader(FileReader(fileName)).use { reader ->
//         var line: String?
//         while (reader.readLine().also { line = it } != null) {
//             println(line)
//         }
//     }

// Sayfa 64 Generic types
fun <T : Number> sum(numbers: List<T>): Double {
    var result = 0.0
    for (number in numbers) {
        result += number.toDouble()
    }
    return result
}
 val intList = listOf(1, 2, 3, 4, 5)
    val doubleList = listOf(1.5, 2.5, 3.5, 4.5, 5.5)
    
    println("Sum of integers: ${sum(intList)}")       // Output: Sum of integers: 15.0
    println("Sum of doubles: ${sum(doubleList)}")  
  	
    
    // Sayfa 65 also 
    var myVariable = "Muhammet Gundo"
    var mySecondVariable = myVariable.also {
		
        
        
        println(it.toUpperCase())
         println(it)
         it.toUpperCase()
        }
    
    // Sayfa 67 function with default parameters
    fun greet(name: String = "World", message: String = "Hello") {
    println("$message, $name!")
}
    greet()
    
    //Sayfa 68 = Infix Functions
     infix fun String.greets(other: String) {
        println("$this says hello to ${other}")
    }
     "Muhammet" greets "Yunus"
    
    // Sayfa 69 = operator function
//  operator fun ArrayList<Any>.get(range: IntRange) = ArrayList(subList(range.first, range.last + 1))

// val opList = arrayListOf("muhammet", "Ali", "Veli", "Zeki")
// println(opList[0..2]) bu kod çalışmadı muhtemelen online compiler operator fonksiyonu tanımadı
    
    // Sayfa 70 = vararg
    fun concatenateStrings(vararg strings: String): String {
    return strings.joinToString(separator = " ")
}

println(concatenateStrings("a","b","c"))  


// Sayfa 70 ten sonraki örnekler öncekilerin tekrarı olduğu için yapmadım

    
   }

//Sayfa 12 =  Class
class Computer(val ram: Int, val cpu: Int){
   fun printComputer(){
       println("Your computer ram is $ram and your computer's cpu is $cpu")
   }
    
}

// Sayfa 13 = Inheritance

open class Shape(){
    
}
class Square(): Shape(){
    
}

 // Sayfa 37 = Data Class
 data class Product(
 val name: String,
 val quantity: Int)
 
 // Sayfa 47 = Singleton
 object MuhammetSingleton {
     var name = "Muhammet"
     var password = "123456"
 }
 
 // Sayfa 48 abstract class
 abstract class Telefon(){
     abstract fun cagriYap()
 	 abstract fun mesajAt()
 }
 
 class AkilliTelefon(): Telefon(){
     override  fun cagriYap() = println("Çağrı yapılıyor")
     override  fun mesajAt() = println("Mesaj atılıyor")
 	 fun oyunOyna() = println("Oyun oynanıyor")    
 }
 class Nokia(): Telefon() {
     override  fun cagriYap() = println("Nokia çağrı yapıyor")
 	override  fun mesajAt() = println("Nokia mesaj atıyor")
     fun snakeOyna() = println("Snake oynanıyor")
     
 }