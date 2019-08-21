import java.time.LocalDateTime
import kotlin.math.pow

fun main(args: Array<String>){
    var int = 5;
    val inttoo = 4;
    int = int shr 2;
    println("$int");
    int = int shl 2;
    println("$int");
    int = int.inv();
    println(int)
    var b = (int or inttoo > 1) or false;
    var c = (int or inttoo < 1) and true;
    var d = b xor c;
    println(b);
    println(c);
    println(d);
    // ! == .not()
    val result = !b xor b.not();
    println(result);
    val x = 3;
    println("Included $x in range 10 8 6 4 2: " + checkIn(x));
    println("Which number 9: "+returningValueByIfElse(9));
    println(beginMiddleEnd(LocalDateTime.now().dayOfMonth));
    squareTable(1, 10);
    squareTable(end = 10, begin = 1);
    output("Hi","dear","kind","doggy","I","love","you")
}
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
}