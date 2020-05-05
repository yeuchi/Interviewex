# Interviewex
Interview exercises in Kotlin : Algorithm and data structure

- basic CRUD operations (No detail edge cases)
- speed implementation of code / happy path tests for interview. (not optimized)
- Junit tests cover 'happy paths' (no failure, boundary conditions)
- little generic coverage.


## Data structures

#### Trie 04/29/2020 
https://github.com/yeuchi/Interviewex/tree/master/app/src/main/java/com/ctyeung/interviewex/Trie
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Trie/TrieTest.kt

#### First in First out (FIFO or queue) 04/30/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/FIFO.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/FIFOTest.kt

#### Last in First out (LIFO or stack)  04/30/2020 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/LIFO.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/LIFOTest.kt

#### LinkedList 04/30/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/List/LinkedList.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/List/LinkedListTest.kt

#### BinaryTree 04/30/2020
- missing remove(), breadthFirstSearch() and balance algorithm
- support Generic Type <T>
  
https://github.com/yeuchi/Interviewex/tree/master/app/src/main/java/com/ctyeung/interviewex/Tree
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Tree/BinaryTreeTest.kt

#### Graph 05/5/2020
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Graph/Graph.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Graph/GraphTest.kt

## Sort

#### BubbleSort 05/3/2020 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/BubbleSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/BubbleSortTest.kt

#### InsertSort 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/InsertSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/InsertSortTest.kt

#### MergeSort 05/4/2020 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/MergeSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/MergeSortTest.kt

#### QuickSort 
https://github.com/yeuchi/Interviewex/blob/master/app/src/main/java/com/ctyeung/interviewex/Sort/QuickSort.kt
https://github.com/yeuchi/Interviewex/blob/master/app/src/test/java/com/ctyeung/interviewex/Sort/QuickSortTest.kt


## Android basics

#### Navigation Architecture Component, Async Network Request 05/1/2020
- most basic story board with fragments and bundles.
- traditional async network request/callback and coroutine runBlocking 

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
