package com.ctyeung.interviewex.network

import com.ctyeung.interviewex.jsonParser.CountryJson

interface IRecyclerCallback {
    fun onHandleItemClicked(country:CountryJson?) {

    }
}