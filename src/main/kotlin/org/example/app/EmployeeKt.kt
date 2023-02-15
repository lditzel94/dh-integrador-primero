package org.example.app

class EmployeeKt(
    name: String,
    sells: Int,
    private var seniority: Int
) : SellerKt(name, sells) {
    private val affiliates: MutableList<SellerKt>
        get() = affiliates

    override fun calculatePoints() =
        let {
            points += 10 * affiliates.size + 5 * (sells + seniority)
        }


    fun addAffiliate(affiliate: AffiliateKt): Unit =
        let {
            affiliates.add(affiliate)
        }

}