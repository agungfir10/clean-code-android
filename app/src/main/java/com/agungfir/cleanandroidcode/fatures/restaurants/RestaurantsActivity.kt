package com.agungfir.cleanandroidcode.fatures.restaurants

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.agungfir.cleanandroidcode.R
import com.agungfir.cleanandroidcode.Restaurant
import com.agungfir.cleanandroidcode.api.RestaurantsRestClient
import com.agungfir.cleanandroidcode.business.restaurants.RestaurantRules
import com.agungfir.cleanandroidcode.data.restaurants.RestaurantParser
import kotlinx.android.synthetic.main.activity_restaurants.*

class RestaurantsActivity : AppCompatActivity() {

    private val restaurantClient = RestaurantsRestClient()
    private var restaurantsAdapter: RestaurantsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)
        restaurantsAdapter = RestaurantsAdapter()
        recyclerViewRestaurants.apply {
            layoutManager = LinearLayoutManager(
                context!!,
                LinearLayoutManager.VERTICAL,
                false
            )
            this.adapter = restaurantsAdapter
        }
        showRestaurants()
    }

    private fun showRestaurants() {

        restaurantClient.getRestaurants { response ->
            // parsing, filtering, displaying
            val restaurantParser = RestaurantParser()
            val restaurantRules = RestaurantRules()
            val parsedRestaurants = restaurantParser.parseRestaurants(response)
            val filteredRestaurants = restaurantRules.filterRestaurants(parsedRestaurants)
            displayRestaurants(filteredRestaurants)

        }

    }

    private fun displayRestaurants(restaurants: List<Restaurant>) {
        val viewModel = RestaurantsViewModel()
        restaurantsAdapter!!.restaurants = viewModel.getDisplayRestaurants(restaurants)
        restaurantsAdapter!!.clickListener =
            object : RestaurantsAdapter.RestaurantClickListener {
                override fun onRestaurantClicked(restaurantId: Int) {
                    Toast.makeText(
                        this@RestaurantsActivity,
                        "Pressed a restaurant!",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }


    override fun onDestroy() {
        super.onDestroy()
        restaurantClient.stopStream()
    }

}