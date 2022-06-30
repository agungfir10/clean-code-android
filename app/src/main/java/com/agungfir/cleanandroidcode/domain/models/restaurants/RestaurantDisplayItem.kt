package com.agungfir.cleanandroidcode.domain.models.restaurants

import com.agungfir.cleanandroidcode.domain.models.restaurants.RestaurantType

data class RestaurantDisplayItem(
    val id: Int,
    val displayName: String,
    val displayDistance: String,
    val imageUrl: String,
    var type: RestaurantType
)