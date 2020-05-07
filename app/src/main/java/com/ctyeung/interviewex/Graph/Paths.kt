package com.ctyeung.interviewex.Graph

import java.lang.System.out

data class Paths<T>(val sourceVertex:T,
                    val vertexes:MutableSet<T>)  {

    private var hashMap:HashMap<T, Path<T>>

    init {
        hashMap = HashMap<T, Path<T>>()
        for(vertex in vertexes){
            var path = Path<T>(sourceVertex, vertex, ArrayList<T>())

            if(vertex == sourceVertex)
                path.isDone = true

            hashMap.put(vertex, path)
        }
    }

    fun getPath2(destination:T):ArrayList<T>? {
        val path = hashMap[destination]
        return path!!.list
    }

    /*
     * Calculate shortest paths from source to each node
     */
    fun compute(graph:Graph<T>) {
        val hashSet = graph.hashmap[sourceVertex]
        var unvisited = HashSet<T>()
        var visited = HashSet<T>()

        for(vertex in vertexes) {
            when {
                // itself
                vertex == sourceVertex -> { /* nothing to do */ }

                // a connected edge
                hashSet!!.contains(vertex) -> {
                    var path = hashMap[vertex]
                    path!!.list.add(vertex)
                    path!!.isDone = true
                    visited.add(vertex)
                }
                else -> {
                    unvisited.add(vertex)
                }
            }
        }

        var depth = 0
        while(unvisited.size>0) {
            makeConnections(visited, unvisited, graph, ++depth)
        }
    }

    /*
     * basic unweighted graph connections
     */
    private fun makeConnections( visited:HashSet<T>,
                                 unvisited:HashSet<T>,
                                 graph:Graph<T>,
                                 depth:Int) {
        val arrayVisited = visited.toArray()
        for (v in arrayVisited){
            val connected = graph.hashmap[v]!!.toArray()
            val prefix = hashMap[v]

            for(it in connected){
                when {
                    it == sourceVertex-> {}

                    unvisited.contains(it)-> {
                        var path = hashMap[it]
                        if(!path!!.isDone) {
                            path!!.isDone = true

                            path!!.list.addAll(prefix!!.list)
                            path!!.list.add(it as T)

                            visited.add(it)
                            unvisited.remove(it)
                        }
                    }
                }
            }
        }
    }
}