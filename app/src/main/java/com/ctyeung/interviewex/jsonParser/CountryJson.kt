package com.ctyeung.interviewex.jsonParser

import org.json.JSONArray
import org.json.JSONObject
import java.lang.Exception

data class CountryJson (val json:JSONObject) {

    fun getName():String {
        return json.get("name").toString()
    }

    fun getCapital():String {
        return json.get("capital").toString()
    }

    fun getRegion():String {
        return json.get("region").toString()
    }

    fun getPopulation():Long {
        try {
            val num = json.get("population").toString()
            return num.toLong()
        }
        catch (ex:Exception){
            return -1
        }
    }

    fun getCurrencies():List<String> {
        return parseList("currencies", "code")
    }

    fun getLanguages():List<String> {
        return parseList("languages", "name")
    }

    fun getBorders():List<String> {
        try {
            val array = json.get("borders") as JSONArray
            var list = ArrayList<String>()
            if (null != array && array.length() > 0) {
                val max = array.length() - 1
                for (i in 0..max) {
                    list.add(array[i].toString())
                }
            }
            return list
        }
        catch (ex:Exception){
            return List<String>(1){ex.toString()}
        }
    }

    private fun parseList(key:String, subKey:String):List<String> {
        try {
            val array:JSONArray = json.get(key) as JSONArray
            var list = ArrayList<String>()
            if(array.length()>0) {
                val max = array.length() - 1
                for (i in 0..max) {
                    val hash = array.get(i) as JSONObject
                    val item = hash[subKey]
                    list.add(item.toString())
                }
            }
            return list
        }
        catch (ex:Exception){
            return List<String>(1){ex.toString()}
        }
    }

    fun getSubRegion():String {
        return json.get("subregion").toString()
    }

    fun getArea():Long {
        try {
            val num = json.get("area").toString()
            return num.toLong()
        }
        catch (ex:Exception){
            return -1
        }
    }
}