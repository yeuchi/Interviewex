# Interviewex
Interview exercises in Kotlin : Algorithm and data structure

- basic operators (No detail edge cases)
- speed implementation of code / happy path tests for interview. (not optimized)
- Junit tests cover 'happy paths' (no failure, boundary conditions)


## Data structures

#### Trie 04/29/2020 
https://github.com/yeuchi/Interviewex/tree/master/app/src/main/java/com/ctyeung/interviewex/Trie
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Trie/TrieTest.kt
<img width="500" src="https://user-images.githubusercontent.com/1282659/81087279-20e50880-8ebf-11ea-80d5-b4ae3aade136.png">

#### LinkedList 04/30/2020 (can be implemented as LIFO / FIFO)
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/LinkedList.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/LinkedListTest.kt
<img width="280" src="https://user-images.githubusercontent.com/1282659/81089720-4de6ea80-8ec2-11ea-8b28-1050c2df319a.png">

#### First in First out (FIFO or queue) 04/30/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/FIFO.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/FIFOTest.kt
<img width="410" src="https://user-images.githubusercontent.com/1282659/81087782-bbdde280-8ebf-11ea-8a98-6359d9a9b641.png">

#### Last in First out (LIFO or stack)  04/30/2020 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/LIFO.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/LIFOTest.kt
<img width="280" src="https://user-images.githubusercontent.com/1282659/81088433-8be30f00-8ec0-11ea-94a0-e6cf9bf91ae2.png">

#### BinaryTree 04/30/2020
- BigO average: log n worst case: n
- missing remove() and balance algorithm
- support Generic Type <T>
  
https://github.com/yeuchi/Interviewex/tree/master/app/src/main/java/com/ctyeung/interviewex/Tree
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Tree/BinaryTreeTest.kt
<img width="260" src="https://user-images.githubusercontent.com/1282659/81089266-c4371d00-8ec1-11ea-81fa-aa5baac62692.png">

#### Graph 05/05/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Graph/Graph.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Graph/GraphTest.kt
<img width="290" src="https://user-images.githubusercontent.com/1282659/81088917-470ba800-8ec1-11ea-9f5f-52103767445a.png">


## Sort

#### BubbleSort 05/3/2020 
- BigO worst case: n * n
- support parallel processing

https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/BubbleSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/BubbleSortTest.kt
<img width="260" src="https://user-images.githubusercontent.com/1282659/81109849-5d752c00-8ee0-11ea-93ff-6af7383772ba.png">

#### InsertSort 
- sorted internal list
- bisection rule BigO average: log n

https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/InsertSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/InsertSortTest.kt
<img width="480" src="https://user-images.githubusercontent.com/1282659/81093004-1169bd80-8ec7-11ea-820d-412dda6da1a6.png">

#### MergeSort 05/04/2020 
- BigO average: n log n 
- support parallel processing

https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/MergeSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/MergeSortTest.kt
<img width="350" src="https://user-images.githubusercontent.com/1282659/81091656-247b8e00-8ec5-11ea-9369-4796985f5919.png">

#### QuickSort 
- BigO average: n log n worst case: n * n 
- support parallel processing

https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/QuickSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/QuickSortTest.kt
<img width="400" src="https://user-images.githubusercontent.com/1282659/81103180-4e897c00-8ed6-11ea-9c78-c99f3c7e0ca3.png">

#### Dijkstra 05/07/2020
- basic path finding on an unweighted graph.

https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Graph/DijkstraShortPath.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Graph/DijkstraShortPathTest.kt


## Probability

#### Population - histogram / probability 05/08/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Probability/Population.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Probability/PopulationTest.kt

#### Huffman Code tree 05/09/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Probability/CodeTree.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Probability/CodeTreeTest.kt

#### Huffman coding / decoding
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Probability/Huffman.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Probability/HuffmanTest.kt
<img width="380" src="https://user-images.githubusercontent.com/1282659/81514800-93f2e280-92f6-11ea-889b-040542d6cd61.png">


## Android basics

#### Navigation Architecture Component, Async Network Request 05/1/2020
- most basic story board with fragments and bundles.
- traditional async network request/callback and coroutine runBlocking 
- should use Gson for JSON deserialization; But Gson does not support nested objects so use JsonHelpers.

Model-View-View-Model / data-binding / life-cycle \
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/viewModels/DetailViewModel.kt

Async Network communication RESTful Get() \
https://github.com/yeuchi/Interviewex/tree/master/app/src/main/java/com/ctyeung/interviewex/network

Fragment Architecture Component \
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/HomeFragment.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/DetailFragment.kt
nav_graph https://github.com/yeuchi/Interviewex/tree/master/app/src/main/res/navigation

### Detail fragment
<img width="200" src="https://user-images.githubusercontent.com/1282659/80932454-0dce1d80-8d85-11ea-8e1a-d254430a1616.png">  <img width="200" src="https://user-images.githubusercontent.com/1282659/80932452-0c045a00-8d85-11ea-9af4-cc10ce301525.png">

<img width="400" src="https://user-images.githubusercontent.com/1282659/80932459-1292d180-8d85-11ea-928f-09aaf396dde6.png">  <img width="400" src="https://user-images.githubusercontent.com/1282659/80932457-11fa3b00-8d85-11ea-88a6-2bc91c3f6cde.png">


## References
1. Merge Sort GeeksforGeeks
https://www.geeksforgeeks.org/merge-sort/

2. Data Structures & algorithm analysis in C++, 2nd Edition by Mark Allen Weiss, 1999 ISBN 0-201-36122-1

3. Numerical Recipes in C, 2nd Edition by Press, Teukolsky, Vetterling, Flannery, 1992 Cambridge University Press

4. Quick Sort GeeksforGeeks
https://www.geeksforgeeks.org/quick-sort/

5. Algorithms in Kotlin, Graphs, Part 5/7 by Nazmul Idris, Aug 16, 2018 \
https://developerlife.com/2018/08/16/algorithms-in-kotlin-5/#undirected-graphs

6. Huffman Coding : A CS2 Assignment
https://www2.cs.duke.edu/csed/poop/huff/info/

7. [Kotlin] Operator overloading by romainbsl
https://www.codingame.com/playgrounds/6847/kotlin-operator-overloading
