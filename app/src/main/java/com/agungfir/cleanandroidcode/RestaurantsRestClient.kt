package com.agungfir.cleanandroidcode

import com.agungfir.cleanandroidcode.mocks.MockCreator
import java.util.concurrent.TimeUnit

class RestaurantsRestClient {
    fun getRestaurants(userId: Int) =
        MockCreator.getRestaurantsResponseMock().delay(1000, TimeUnit.MILLISECONDS)
}