fun  main() {
    try {
        println("Введите k1")
        var k1 = readLine()!!.toDouble()
        println("Введите b1")
        var b1 = readLine()!!.toDouble()
        println("Введите k2")
        var k2 = readLine()!!.toDouble()
        println("Введите b2")
        var b2 = readLine()!!.toDouble()
        println("Введите e")
        var e = readLine()!!.toDouble()
        var x = (b2-b1)/(k1-k2)
        var y = k1*x+b1
        when{
            k1==k2 && Math.abs(b1-b2)<=e -> println("Прямая пересекается с e")
            k1==k2 && Math.abs(b1-b2)>e -> println("Прямая не пересекается с e")
            Math.sqrt((Math.pow(x, 2.0)+(Math.pow(y, 2.0) )))<=e -> println("Точка пересечения содержится в е")
            else ->println("Точка пересечения не содержится в е")
        }

    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}