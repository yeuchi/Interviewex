package com.ctyeung.interviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctyeung.interviewex.jsonParser.CountryJson
import com.ctyeung.interviewex.jsonParser.JSONHelper
import com.ctyeung.interviewex.network.IRecyclerCallback
import org.json.JSONArray


class CountryListAdapter : RecyclerView.Adapter<CountryListAdapter.CountryViewHolder> {

    val callback:IRecyclerCallback
    private val jsonArray: JSONArray

    constructor(listener:IRecyclerCallback, jsonArray: JSONArray){
        this.callback = listener
        this.jsonArray = jsonArray
    }

    override fun getItemCount(): Int {
        return jsonArray.length()
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
    }

    private var index:Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.item_country, parent, false)
        val countryJson = JSONHelper.parseJsonFromArray(jsonArray, index++)
        val country = CountryJson(countryJson!!)
        var holder = CountryViewHolder(view, country, callback)
        return holder
    }

    class CountryViewHolder : RecyclerView.ViewHolder, View.OnClickListener {
        private var country:CountryJson
        private var callback:IRecyclerCallback
        //  lateinit var binding:ItemCountryBinding
        private var name: TextView

        constructor(itemView: View, country:CountryJson, callback:IRecyclerCallback) : super(itemView) {
            this.country = country
            this.callback = callback

            name = itemView.findViewById<TextView>(R.id.txtCountryName)
            name.setOnClickListener(this)
            name.text = country.getName()
        }

        override fun onClick(v: View?) {
            callback.onHandleItemClicked(country)
        }
    }
}