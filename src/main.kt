import learning.*
fun unit(){}
var gcd = {unit()}; // { getCurrentDate() } лямбда-выражение. если вывести лямбду без аргументов - тело функции

fun main(){
    fun redundantStuff(){
        var int = 5;
        val second = 4;
        int = int shr 2;
        println("$int");
        int = int shl 2;
        println("$int");
        int = int.inv();
        println(int)
        val b = (int or second > 1) or false;
        val c = (int or second < 1) and true;
        val d = b xor c;
        println(b);
        println(c);
        println(d);
        // ! == .not()
        val result = !b xor b.not();
        println(result);
    }
    gcd = { redundantStuff() } //  - нельзя, так как после инициализации gcd имеет возвращаемое значение LocalDateTime?, а redundantStuff - Unit
    var oas = {array: Array<String> -> output(*array, index = 0)}
    val x = 3;
    println("Included $x in range 10 8 6 4 2: " + checkIn(x));
    println("Which number 9: "+returningValueByIfElse(9));
    println(getCurrentDate()?.dayOfMonth?.let { beginMiddleEnd(it) });
    squareTable(1, 10);
    squareTable(end = 10, begin = 1)
    //output("Hi","dear","kind","doggy","I","love","you")
    //output("Hi","dear","kind","doggy","I","love","you", index = 0)
    oas(arrayOf("Hi","dear","kind","doggy","I","love","you"));
    usingLambda();
}

fun usingLambda() {
    var hello = {println("hello")}
    hello()
    run { println("hello by run")}
    println(gcd())
}