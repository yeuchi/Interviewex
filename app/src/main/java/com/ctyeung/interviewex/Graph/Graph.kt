package com.ctyeung.interviewex.Graph

class Graph<T> {

    var hashmap = HashMap<T, HashSet<T>>()
    fun addEdge(sourceVertex:T, destinationVertex:T) {
        // node has no edges
        if(!hashmap.containsKey(sourceVertex)) {
            var hashset = HashSet<T>()
            hashset.add(destinationVertex)
            hashmap.put(sourceVertex, hashset)
        }
        // node has at least 1 edge
        else {
            var hashset = hashmap[sourceVertex]

            // if not visited destination
            if(!hashset!!.contains(destinationVertex)) {
                hashset.add(destinationVertex)
            }
        }
    }
}