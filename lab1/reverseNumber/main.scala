object Main22 {
    def main(args: Array[String]): Unit = {
        print("Enter the number: ")
        
        val number = scala.io.StdIn.readInt

        val reversedNumber = number.toString.reverse.toInt
        
        var ms = Array[Int](0,0,0,0,0,0,0,0,0,0)

        for(i <- reversedNumber.toString())
            ms(i.asDigit) += 1

        for(i <- ms)
            print(i.toString())
    }
}