package com.plcoding.cryptocurrencyappyt

import dagger.hilt.android.HiltAndroidApp
import android.app.Application

//a class to give Hilt access to our application
@HiltAndroidApp
class CoinApplication : Application()