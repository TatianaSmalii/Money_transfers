import java.util.Scanner

fun main() {
    print( "Введите сумму перевода: \n (Сумма перевода должна быть больше 35 рублей) \n"
    )
    val amount = Scanner(System.`in`).nextInt()

    if (amount >= 35) {
        val persent = 0.75
        val commission = amount * (persent / 100)
        val sumTranslation = amount - amount * (persent / 100)
        println("Ваша комиссия с $amount рублей, составляет $commission рублей")
        println("Итоговая сумма перевода: $sumTranslation рублей")

    }
    if (amount <= 35) {
        println("Минимальная сумма перевода 35 рублей")

    }
}

