object Main {

    def getFirstNumber(numberString: String) : Int = {
        numberString.substring(0, 5).toInt
    }

    def getSecondNumber(numberString: String) : Int = {
        numberString.substring(5, 10).toInt
    }

    def getW(a: Int, b: Int): Long  =
    {
        val wAsString = b.toString() + a.toString()
        wAsString.toLong
    }

    def getResult(c: Long): Float = {
        c.toString().substring(0,3).toFloat / 1000
    }

    def main(args: Array[String]): Unit = {
        var a=0
        var b=0
        var c=0l
        var rez: Float = 0.0
        var w = 0l
        
        print("Enter the number (Z): ")
        var numberString = scala.io.StdIn.readLine()

        if (numberString.length() < 10) {
            println("Incorrect number should be greater than 10 characters");
            sys.exit(0)  
        }


        for (i <- 1 to 3) {
            println("numberString=" + numberString)
            a = getFirstNumber(numberString)
            b =  getSecondNumber(numberString)

            w = getW(a, b);
            
            c = numberString.toLong * w

            if(c < 0)
                c *= -1

            rez = getResult(c)

            println(a);
            println(b);
            println(c);
            println("res=" + rez); 

            numberString = c.toString();
        }
    }
}