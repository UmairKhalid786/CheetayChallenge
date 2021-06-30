package com.techlad.cheetaychallenge.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkRequest
import com.techlad.cheetaychallenge.utils.Global

object Util {

    fun startNetworkCallback(context: Context) {
        val cm: ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val builder: NetworkRequest.Builder = NetworkRequest.Builder()

        cm.registerNetworkCallback(
            builder.build(),
            object : ConnectivityManager.NetworkCallback() {

                override fun onAvailable(network: Network) {
                    Global.Variables.isNetworkConnected = true
                }

                override fun onLost(network: Network) {
                    Global.Variables.isNetworkConnected = false
                }
            })
    }
}