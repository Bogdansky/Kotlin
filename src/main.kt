import java.time.LocalDateTime

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
    println("Included $x in range 1..10: " + checkIn(x));
    println("Which number 9: "+returningValueByIfElse(9));
    println(beginMiddleEnd(LocalDateTime.now().dayOfMonth));
}

fun checkIn(variable: Int): Boolean{
    val lowerBound = 1;
    val topBound = 10;
    return variable in lowerBound..topBound;
}

fun returningValueByIfElse(variable: Int): String{
    return if (variable !in -9..9){
        "Composite"
    } else {
        "Simple"
    }
}

fun beginMiddleEnd(day: Int): String {
    println("Now is $day");
    val part = when (day){
        in 1..10 -> "Begin"
        in 11..20 -> "Middle"
        else -> "End"
    }
    return "$part of month";
}
