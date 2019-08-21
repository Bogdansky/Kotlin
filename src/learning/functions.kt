package learning

import java.time.LocalDateTime

// sequences
fun checkIn(variable: Int): Boolean{
    val lowerBound = 1;
    val topBound = 10;
    val resultRange = topBound downTo lowerBound step 2; // until - не включая
    return variable in resultRange; // sequence или последовательность
}
//condition constructions
fun returningValueByIfElse(variable: Int): String{
    return if (variable !in -9..9){
        "Composite"
    } else {
        "Simple"
    }
}
// operator "when"
fun beginMiddleEnd(day: Int): String {
    println("Now is $day");
    val part = when (day){
        in 1..10 -> "Begin"
        in 11..20 -> "Middle"
        else -> "End"
    }
    return "$part of month";
}
//cycles
fun squareTable(begin: Int, end: Int){
    for(n in begin..end){
        val pow2 = n * n;
        println("$n: $pow2");
    }
}
// non-fixed number of args
fun output(vararg strings: String){
    for(n in strings){
        print("$n ");
    }
    println();
}
//overloading output(...strings). return type is not taken
fun output(vararg strings: String, index: Int = 0){
    var ind = index;
    val str = strings[ind++];
    print("$str ");
    if (ind == strings.size) { println(); return } else output(*strings, index = ind);
}

fun getCurrentDate(): LocalDateTime? = LocalDateTime.now();