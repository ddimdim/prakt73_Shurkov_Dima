fun main() {
    try
    {
        println("Введите первый член прогрессии")
        var num1 = readLine()!!.toDouble()
        println("Введите пятый член прогрессии")
        var num2 = readLine()!!.toDouble()
        print("Введите номер члена прогрессии: ")
        var n = readLine()!!.toInt()
        var d = (num2 - num1) / 4
        var an = num1 + (n - 1) * d
        var sum = (((num1 + an) * n) / 2)
        println("$n член прогрессии: $an")
        println("Сумма первых n членов прогрессии: $sum")
    }
    catch (e:Exception)
    {
        println("Неверно введено данное")
    }
}