const val discount = 100
const val discount2 = 5
const val discountForMusicLover = 1

fun main() {
    println(AfterDiscount(100, true))
    println(AfterDiscount(1700, false))
    println(AfterDiscount(19000, true))
}

fun AfterDiscount(sum: Int, isPermanent: Boolean): String {
    var rubles = 0
    var penny = 0
    if (sum <= 1000) rubles = sum else if (sum in 1001..10000) rubles = (sum - discount)
    else {
        rubles = sum - sum / 100 * discount2
        penny = sum % 100 * discount2
    }
    if (isPermanent) {
        penny += rubles * 100
        penny -= penny / 100 * discountForMusicLover
        rubles = penny / 100
        penny %= 100
    }
    return "$rubles рублей, $penny копеек"

}