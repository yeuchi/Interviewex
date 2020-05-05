package com.ctyeung.interviewex.Graph

class Graph<T> {

    var hashmap = HashMap<T, HashSet<T>>()
    fun addEdge(sourceVertex:T, destinationVertex:T):Boolean {
        // node has no edges
        if(!hashmap.containsKey(sourceVertex)) {
            var hashset = HashSet<T>()
            hashset.add(destinationVertex)
            hashmap.put(sourceVertex, hashset)
            return true
        }
        // node has at least 1 edge
        else {
            var hashset = hashmap[sourceVertex]

            // if not visited destination
            if(!hashset!!.contains(destinationVertex)) {
                hashset.add(destinationVertex)
                return true
            }
        }
        return false
    }

    fun removeEdge(sourceVertex:T, destinationVertex:T):Boolean {
        if(hashmap.containsKey(sourceVertex)) {
            var hashset = hashmap[sourceVertex]
            if(hashset!!.contains(destinationVertex)) {
                hashset.remove(destinationVertex)
                return true
            }
        }
        return false
    }
}