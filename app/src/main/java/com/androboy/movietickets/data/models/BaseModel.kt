package com.androboy.movietickets.data.models

import com.androboy.movietickets.network.dataAgents.MovieDataAgent
import com.androboy.movietickets.network.dataAgents.RetrofitDataAgent

abstract class BaseModel {

    protected val dataAgent : MovieDataAgent = RetrofitDataAgent


}