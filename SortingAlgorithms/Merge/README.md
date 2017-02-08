## Learning to Merge Sort in Python

### Introduction
  Merge sort is a fast sorting algorithem but it is not used as often in modern applications because hardware is optmised for other sorting algorithems.  Merge sort uses the divide and conquor method of sorting, by dividing the list and then recombining the lists in a sorted manner.

### Concept
  Merge sort works by splitting the list into individual elements, and then combining it back together into a sorted list.  While quick sort does most of the sorting during the division of the list, merge sort does most all the sorting while merging the list back together.
  
#### Example
Given [2,4,3,1]

Note that this list is a different order than the other sorting examples to demonstrate a better point.

##### Step 1: Split the list into elements.

  `L1 = [2,4]`
  
  `L2 = [3,1]`
  
  `L11 = [2]`
  
  `L12 = [4]`
  
  `L21 = [3]`
  
  `L22 = [1]`
  
##### Step 2: Merge the lists from 1 element lists to 2 element lists while sorting the values

  `Compare L11 --> L12 2 < 4; Merge L1_sorted = [2,4]`
  
  `Compare l21 --> l22 3 > 1; Merge L2_sorted = [1,3]`
  
##### Step 3: (The end condition) Continue merging the lists untill all the lists are merged into one list.

  `Compare L1_sorted[0] --> l2_sorted[0]; 1 < 2 Add smaller element; sorted_list = [1]`
  
  `Compare L1_sorted[0] --> l2_sorted[1]; 2 < 3 Add smaller element; sorted_list = [1,2]`
  
  `Compare L1_sorted[1] --> l2_sorted[1]; 4 > 3 add smaller element; sorted_list = [1,2,3]`
  
  `One value left, must be largest, add element; sorted_list = [1,2,3,4]`
  

### Impelementation

  This is being left to the reader for now
  
    
