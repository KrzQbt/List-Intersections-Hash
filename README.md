This program finds duplicate values from two lists.

The main idea here is that for hash table insertion and search operations has average time complexity of O(1). Simple, but much slower solution with linear search has average O(n/2) and pessimistic O(n) complexity.

The crucial part of program inserts the ArrayList contents (of n size) into hashtable. Then each of the elements of other ArrayList (of size m) is searched in the hash table. If there is a duplicate value found in hash table (same hash), the value is added to LinkedList containing intersections.

To sum up: 
There are n insertions to hash table of size n with average time complexity O(1), which gives O(n). 
Then m values are retrieved from arrayList( O(1) m times), which gives O(m). 
Each value is searched in hashtable m times, with average complexity O(1) expected, which gives on average O(m).
When a value is a duplicate it is inserted into Linked list with total pesimistic time compleixty of O(m) (for all values matching).

It can be expected that complexity of coliding hashes to find duplicates has average time complexity of O(n +2m) ( main part of the algorithm ).
