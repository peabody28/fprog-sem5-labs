object Numbers {
    def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }
}

object Main22 {
    def main(args: Array[String]): Unit = {
        print("Enter the first number: ")
        val a = scala.io.StdIn.readLine().toInt
        print("Enter the second number: ")
        val b = scala.io.StdIn.readLine().toInt

        val gcdValue = Numbers.gcd(a, b)
        println(s"The greatest common divisor of $a and $b is $gcdValue")
    }
}

