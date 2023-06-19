//Arrays.
fun main() {
    stmt()
    join()
    num()
    numbers()

    println(countvowels())

    val nestedList = listOf(1, 2, listOf(3, 4, listOf(5, 6)), 7, 8)
    val flattenedList = flattenList(nestedList)
    println(flattenedList)

}

fun stmt(){
    var word= arrayOf("Gisembs","Milkah","Mumbua","&","Pauline","are friends")
    //var words=word.plus("Nathalie")
    //var x=word.sortedArray()
    println(word.size)
    println(word.get(4))
    println(word.indexOf("Mumbua"))
    //print(words[4])
   // println(x)
}

fun join(){
    var odd= arrayOf(1,3,5,7,9)
    var even= arrayOf(2,4,6,8,10)
    var joining= arrayOf(odd,even)
    var joined= arrayOf(*joining)
    print(joined.contentDeepToString())//contentDeepToString returns contents of a n array as if it is a list.
}

fun num(){
    var nums= arrayOf(
        intArrayOf(1,3,5,7),
        intArrayOf(2,4,6,8),
        intArrayOf(9,13,15,17)

    )
    print(nums.contentDeepToString())
}

fun numbers(){
    var numArray= arrayOf(13,43,20,34,57,89,52)
    var numsArray= arrayOf(1,6,7,13,57,34,15,2,5,10)
    println(numsArray.sortedArray().contentToString())
    //var sortedArray=numsArray.sortedArray()
    //println(numsArray.toString(sortedArray.contentToString()))
    println(numArray.count()) // counting the values in the array.
    println(numArray.sum())   //adds the values in the array.
    //println(numArray.sortedArray())
    println(numArray.minOrNull()) //returns the minimum value in the array.
    println(numArray.maxOrNull()) // returns the maximum value in the array.
    for (x in numArray){ //loops through the array and prints the values in the array.
        print(x)
    }
    numArray.forEach { num -> //loops through the string just like using the for loop.
        print(num)
    }
    //Both .forEach and for loop through an array and a string and returns the value in the string.
}

//Write a Kotlin function that takes an array of characters as input and returns the
// number of vowels present in the array.
fun countvowels():Int{
    var txt= arrayOf("My name is Lynette Kinga")
    var vowels= arrayOf("a,e,i,o,u,A,E,IO,U")
    var count=0

    for (i in vowels ){
        if (vowels.contains(i))
        count ++
    }
    return count
}

//Object_Oriented Programing.
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

class CurrentAccount(val account_number:Double,val account_name:String,val balance:Double){

    fun deposit(amount:Double){
     //   balance+=amount
    }
}

//fun sorting(arr:Array<String>){
//    Array<String>
//    }
//}


//Flattening a Nested List in Kotlin
fun flattenList(nestedList: List<Any>): List<Any> {
    val flattenedList = mutableListOf<Any>()
    for (element in nestedList) {
        if (element is List<*>) {
            flattenedList.addAll(flattenList(element))
        } else {
            flattenedList.add(element)
        }
    }
    return flattenedList
}