package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET(value = "/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET(value = "/vi/coins/{coinId}")
    suspend fun getCoinById(@Path(value = "coinId") coinId: String) : CoinDetailDto
}