package com.ctyeung.interviewex.Graph

/*
 * Shortest Path on Graph
 */
class DijkstraShortPath<T> {

    val sourceVertex:T
    val graph:Graph<T>
    var paths:Paths<T>

    /*
     * Instantial and compute shortest paths for source in graph
     */
    constructor(sourceVertex:T, graph:Graph<T>){
        // compute shortest paths
        this.sourceVertex = sourceVertex
        this.graph = graph
        paths = Paths<T>(sourceVertex, graph.hashmap.keys)
        paths.compute(graph)
    }

    /*
     * return hashset of nodes for shortest path
     * -> null only if there is an error (invalid input or constructor graph)
     */
    fun getPath2(destinationVertex:T):ArrayList<T>? {
        return paths.getPath2(destinationVertex)
    }
}