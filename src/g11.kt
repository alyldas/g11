fun main() {
    println("Hello world!")

    var n: UInt? = null
    while (n == null)
        try {
            n = readLine()?.toUInt()
        } catch (e: NumberFormatException) {
            println("Введите неотрицательное целое число.")
        }

    var s: UInt? = 0u
    var m: UInt? = 0u
    while (n != 0u) {
        m = n!!.rem(10u)
        if (m % 2u == 0u)
            s = s!!.plus(m)
        n = n.div(10u)
    }

    println("Сумма четных цифр в числе: $s")
}