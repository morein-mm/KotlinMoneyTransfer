fun main() {
    val commissionMinValue = 35
    val commissionPercent = 0.75
    val amount = 10
    val commissionByPercent = amount * commissionPercent / 100
    val commission = if (commissionByPercent < commissionMinValue) commissionMinValue else commissionByPercent
}