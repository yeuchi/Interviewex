package com.ctyeung.interviewex.network


import android.os.AsyncTask
import java.lang.Exception
import java.net.URL

class AsyncRequest : AsyncTask<URL, Void, String> {

    private var callback:INetworkCallback

    constructor(activity:INetworkCallback) : super() {
        this.callback = activity
    }

    override fun doInBackground(vararg params: URL?): String {
        if(null!=params) {
            val url = params[0]
            try {
                val jsonString = NetworkUtils.getResponseFromHttpUrl(url!!)
                if(null!=jsonString)
                    return jsonString

                // refactor here !
                throw Exception("request failed")
            }
            catch (ex:Exception){
                throw Exception(ex)
            }
        }
        // refactor here !
        throw Exception("doInBackground failed")
    }

    override fun onPreExecute() {

    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        callback.onHandleResponse(result)
    }
}