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
}