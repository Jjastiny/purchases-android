package com.revenuecat.purchases.common

import com.revenuecat.purchases.ProrationMode
import com.revenuecat.purchases.models.StoreTransaction

internal data class ReplaceProductInfo(
    val oldPurchase: StoreTransaction,
    val prorationMode: ProrationMode? = null,
)