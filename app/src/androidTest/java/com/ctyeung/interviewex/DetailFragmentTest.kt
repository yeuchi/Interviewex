package com.ctyeung.interviewex

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.assertion.ViewAssertions.matches

/*
 * https://developer.android.com/training/basics/fragments/testing
 */
@RunWith(AndroidJUnit4::class)
class DetailFragmentTest {

    @Test
    fun testEventFragment() {
        // The "fragmentArgs" and "factory" arguments are optional.
        val str = getCountryString()
        val fragmentArgs = bundleOf("country" to str)
        //val factory = MyFragmentFactory()
        val scenario = launchFragmentInContainer<DetailFragment>(fragmentArgs)
        onView(withId(R.id.txtName)).check(matches(withText("Andorra")))
    }

    private fun getCountryString(): String {
        return "{\"name\":\"Andorra\",\"capital\":\"Andorra la Vella\",\"region\":\"region\",\"population\":10000,\"currencies\":[{\"code\":\"EUR\",\"name\":\"Euro\",\"symbol\":\"€\"}],\"languages\":[{\"iso639_1\":\"ca\",\"iso639_2\":\"cat\",\"name\":\"Catalan\",\"nativeName\":\"català\"}],\"borders\":[\"FRA\",\"ESP\"],\"subregion\":\"Southern Europe\",\"area\":468}"
        // return "{\"name\":\"Andorra\",\"topLevelDomain\":[\".ad\"],\"alpha2Code\":\"AD\",\"alpha3Code\":\"AND\",\"callingCodes\":[\"376\"],\"capital\":\"Andorra la Vella\",\"altSpellings\":[\"AD\",\"Principality of Andorra\",\"Principat d'Andorra\"],\"region\":\"Europe\",\"subregion\":\"Southern Europe\",\"population\":78014,\"latlng\":[42.5,1.5],\"demonym\":\"Andorran\",\"area\":468,\"gini\":null,\"timezones\":[\"UTC+01:00\"],\"borders\":[\"FRA\",\"ESP\"],\"nativeName\":\"Andorra\",\"numericCode\":\"020\",\"currencies\":[{\"code\":\"EUR\",\"name\":\"Euro\",\"symbol\":\"€\"}],\"languages\":[{\"iso639_1\":\"ca\",\"iso639_2\":\"cat\",\"name\":\"Catalan\",\"nativeName\":\"català\"}],\"translations\":{\"de\":\"Andorra\",\"es\":\"Andorra\",\"fr\":\"Andorre\",\"ja\":\"アンドラ\",\"it\":\"Andorra\",\"br\":\"Andorra\",\"pt\":\"Andorra\",\"nl\":\"Andorra\",\"hr\":\"Andora\",\"fa\":\"آندورا\"},\"flag\":\"https:\/\/restcountries.eu\/data\/and.svg\",\"regionalBlocs\":[],\"cioc\":\"AND\"}"
    }
}