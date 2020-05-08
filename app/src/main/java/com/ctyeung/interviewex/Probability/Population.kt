package com.ctyeung.interviewex.Probability

data class Population<T> (var data:ArrayList<T>) {

    var histogram = HashMap<T, Int>()

    init {
        createHistogram()
    }

    fun size():Int {
        return data.size
    }

    fun add(samples:ArrayList<T>) {
        data.addAll(samples)

        createHistogram()
    }

    fun clear() {
        data.clear()
        histogram.clear()
    }

    private fun createHistogram() {
        histogram.clear()

        for (p in data){
            if(! histogram.contains(p)) {
                histogram.put(p, 1)
            }
            else {
                var value = histogram[p]
                histogram.put(p, value!!+1)
            }
        }
    }

    /*
     * Data point probability in the population
     * return: -1 if error
     */
    fun probability(t:T):Float {

        if(histogram.isNotEmpty()) {

            val value = histogram[t]
            if(value != null)
                return value.toFloat() / data.size.toFloat()
        }
        return -1f
    }
}