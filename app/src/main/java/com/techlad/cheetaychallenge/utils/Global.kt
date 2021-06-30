package com.techlad.cheetaychallenge.utils

import kotlin.properties.Delegates

object Global {

    object Variables {
        var isNetworkConnected : Boolean by Delegates.observable(false) { _,_,_, -> }
    }
}