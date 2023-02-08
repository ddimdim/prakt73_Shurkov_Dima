fun  main(){
    try {
        println("Введите a")
        var a = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите c")
        var c = readLine()!!.toDouble()
        val p = (a+b+c)/2
        var h = (2.0/a)*(Math.sqrt(p*(p-a)*(p-b)*(p-c)))
        //В задании указана неправильная формула по нахождению медианы, я ее исправил
        var m = 0.5*(Math.sqrt((2*Math.pow(b, 2.0))+(2*Math.pow(c, 2.0))-Math.pow(a, 2.0)))
        var B = (2*Math.sqrt(b*c*p*(p-a)))/(b+c)
        println("Высота к стороне а: $h")
        println("Медиана к стороне а: $m")
        println("Биссектриса угла А: $B")
    }
    catch (e:Exception)
    {
        println("Неверно введено данное")
    }
}