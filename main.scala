import org.w3c.dom.ranges.RangeException
object Main {
    //1, 2
    def sum(arr: List[Int]): Int = {
        if(arr.isEmpty)
            0
        else 
            arr.head + sum(arr.tail)
    }

    def getItemByIndex(list: List[Int], index: Int, currentIndex: Int = 0): Int = {
        if(list.isEmpty)
            sys.exit(1)
        
        if(currentIndex == index)
            list.head
        else
            getItemByIndex(list.tail, index, currentIndex+1)
    }

    // 3
    def indexOfMin(arr: List[Int], currentIndex: Int, index: Int): Int = {
        if(currentIndex == arr.length - 1)
            index
        else
        {
            var newMinIndex: Int = index
            if(getItemByIndex(arr, index) > getItemByIndex(arr, currentIndex))
                newMinIndex = currentIndex

            indexOfMin(arr, currentIndex + 1, newMinIndex)
        }
    }

    // 4
    def areAllLessThan(lst: List[Int], num: Int): Boolean = {
        if(lst.isEmpty)
            true
        else 
        {
            if (lst.head > num)
                false
            else
                areAllLessThan(lst.tail, num)
        }
    }

    // 5
    def countOfElementsThatLessThan(lst: List[Int], num: Int, count: Int): Int = {
        if(lst.isEmpty)
            count
        else 
        {
            var newCount = count;
            if (lst.head <= num)
                newCount += 1
            
            countOfElementsThatLessThan(lst.tail, num, newCount)
        }
    }

    def main(args: Array[String]): Unit = {

        println("1 - Sum of array")
        println("2 - Sum of elements by indexes")
        println("3 - Index of min element")
        println("4 - Are all elements less than")
        println("5 - Count of elements that less than")
        print("Select action: ")
        val action = scala.io.StdIn.readInt()
        print("Input list: ")
        val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

        if(action == 1)
        {
            val flteredList = list.filter(e => e <= 5 && e >= 0)
            print(sum(flteredList))
        }
        else if(action == 2)
        {
            print("Input indexes: ")
            val indexes = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

            var listForSum = indexes.map(i => list.apply(i))

            print(sum(listForSum))
        }
        else if(action == 3)
            print(indexOfMin(list, 0, 0))
        else if(action == 4)
        {
            print("Input  num: ")
            val num = scala.io.StdIn.readInt()

            print(areAllLessThan(list, num))
        }
        else if(action == 5)
        {
            print("Input  num: ")
            val num = scala.io.StdIn.readInt()

            print(countOfElementsThatLessThan(list, num, 0))
        }
    }
}