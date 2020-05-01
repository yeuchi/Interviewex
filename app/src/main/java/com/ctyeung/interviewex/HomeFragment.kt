package com.ctyeung.interviewex

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.ctyeung.interviewex.databinding.FragmentHomeBinding
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.ctyeung.interviewex.jsonParser.JSONHelper
import com.ctyeung.interviewex.network.IRecyclerCallback
import com.ctyeung.interviewex.network.NetworkUtils
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Exception
import java.net.URL

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), IRecyclerCallback {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var thisFragment:IRecyclerCallback? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        thisFragment = this
    }
    var binding:FragmentHomeBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //var view = inflater.inflate(R.layout.fragment_home, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        //binding = FragmentHomeBinding.bind(view)
        /*binding!!.btnHome.setOnClickListener {
            var bundle = bundleOf("amount" to "hello ammount")
            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)

        }*/
        val amount = arguments?.getString("amount")

        var layoutManager:GridLayoutManager = GridLayoutManager(this.context, 1)
        binding!!.worldCountriesList.layoutManager = layoutManager

        requestCountries()
        return binding!!.root
    }

    fun onClickButton() {
        var bundle = bundleOf("amount" to "hello ammount")
        binding!!.root.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
    }

    fun requestCountries() = runBlocking {
        var jsonString:String? = null
        var scope = CoroutineScope(Dispatchers.IO).launch {
            try {
                val url = URL(NetworkUtils.COUNTRIES_URL)
                jsonString = NetworkUtils.getResponseFromHttpUrl(url!!)
            }
            catch (e: Exception){
                handleError(e.toString())
            }
        }
        scope.join()
        onHandleResponse(jsonString)
    }

    /*
     * Call back - Network request
     * - tried Gson, jackson libraries without success; custom getters for now
     */
     fun onHandleResponse(str: String?) {
        if(null!=str) {
            try {
                //var gson = Gson()
                //val itemType = object : TypeToken<List<Country>>() {}.type
                val jsonArray = JSONHelper.parseJsonArray(str)
                if(null==jsonArray)
                    throw Exception("json parse failed")

                // var mapper = jacksonObjectMapper()
                // var size = jsonArray.length()-1
                //val countries = gson.fromJson<List<Country>>(str, itemType)

                val adapter = CountryListAdapter(thisFragment!!, jsonArray)
                binding!!.worldCountriesList.adapter = adapter
                binding!!.worldCountriesList.hasFixedSize()
                return
            }
            catch (ex: Exception) {
                handleError("json parse failed")
            }
        }
        handleError("network response null")
    }

    /*
 * Display a toast with error message
 */
    private fun handleError(str:String) {
        Toast.makeText(this.context, str, Toast.LENGTH_LONG).show()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
