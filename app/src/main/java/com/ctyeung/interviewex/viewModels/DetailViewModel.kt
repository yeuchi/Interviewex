package com.ctyeung.interviewex.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ctyeung.interviewex.jsonParser.CountryJson
import com.ctyeung.interviewex.jsonParser.JSONHelper
import org.json.JSONObject
import java.text.NumberFormat
import java.util.*

class DetailViewModel (application: Application) : AndroidViewModel(application) {
    var name:String = ""
    var capital:String = ""
    var region:String = ""
    var population:String = ""
    var currencies:String = ""
    var languages:String = ""
    var borders:String = ""
    var subregion:String = ""
    var area:String = ""
    private val context = getApplication<Application>().applicationContext

    fun default(id:Int):String {
        return context.resources.getString(id)
    }

    fun setCountry(jsonString:String) {
        val json: JSONObject? = JSONHelper.parseJson(jsonString)
        if(null!=json) {
            val countryJson = CountryJson(json!!)
            setLiveData(countryJson)
        }
        // throw an exception ?
    }

    fun setLiveData(json:CountryJson) {
        name = json.getName()
        capital = json.getCapital()
        region = json.getRegion()
        population = formatLargeNumber(json.getPopulation())
        currencies = formatList(json.getCurrencies())
        languages = formatList(json.getLanguages())
        borders = formatList(json.getBorders())
        subregion = json.getSubRegion()

        // need to add formatters
        area = "${formatLargeNumber(json.getArea())} km"
    }

    fun formatLargeNumber(num:Long):String {
        return NumberFormat.getNumberInstance(Locale.getDefault()).format(num)
    }

    fun formatList(list:List<String>):String {
        if(list.size==0)
            return "- - -"

        var str=StringBuilder()
        val size = list.size-1
        for(i in 0..size){
            str.append(list[i])

            if(i<size)
                str.append(',')
        }
        return str.toString()
    }
}