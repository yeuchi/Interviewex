package com.ctyeung.interviewex.network

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

object NetworkUtils {

    const val COUNTRIES_URL:String = "https://restcountries.eu/rest/v2/all"

    @Throws(IOException::class)
    fun getResponseFromHttpUrl(url: URL): String? {
        val urlConnection =
            url.openConnection() as HttpURLConnection
        urlConnection.connectTimeout = 3000
        return try {
            val `in` = urlConnection.inputStream
            val scanner = Scanner(`in`)
            scanner.useDelimiter("\\A")
            val hasInput = scanner.hasNext()
            if (hasInput) {
                scanner.next()
            } else {
                null
            }
        } finally {
            urlConnection.disconnect()
        }
    }
}