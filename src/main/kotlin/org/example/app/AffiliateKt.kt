package org.example.app

class AffiliateKt(name: String, sells: Int) : SellerKt(name, sells) {
    override fun calculatePoints() =
        let {
            points += 15 * sells
        }
}