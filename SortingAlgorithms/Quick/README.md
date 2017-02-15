## Learning to Quick Sort in Python

### Introduction
  Quick sort is a commonly used sorting algorithm which is in practice very efficient, although worst case scenario it is no faster than bubble sort.  It uses a divide and conquer method, by dividing the list into sub lists, then combining the sorted lists back together.  The real trick to the quick sort comes to how the sub lists are partitioned and sorted.

### Concept
  As mentioned above, quick sort sorts recursively swapping values greater than the pivot value to the end of the list until the location of the pivot value is found.  Then the list is split at the pivot value and continues the process until no more splits are possible and then combines all the pieces back to the sorted list.

#### Example
Given [2,4,1,3]
For our examples, we will use the first value as the pivot value.  We will also want to track the left most and right most elements after the pivot value and we will know the location for the pivot value when the left most and right most elements are the same element.

##### Step 1: Set comparator values

  `Set pivot = 2`

  `Set leftmost_index = 2`

  `Set rightmost_index = 4`

##### Step 2: Compare pivot value to the left most value, if the left most value is bigger than the right most value, swap the right and left most values, and move the right most value in one until the leftmost and right most values cross elements.

  `Compare pivot --> leftmost; 2 < 4 --> swap = [2,3,1,4];  rightmost_index = 3`

  `Compare pivot --> leftmost; 2 < 4 --> swap = [2,1,3,4]; leftmost_index = 2 rightmost_index = 2`

  `Compare pivot --> leftmost; 2 > 1 --> leftmost_index = 3`

##### Step 4: Now that the right and left index's have crossed, we know that our pivot value goes to leftmost index, swap the pivot value and the value at that point in the list and split the list into pieces.

  `Swap pivot --> rightmost_index [1,2,3,4], split L1 = [1] L2 = [3,4]`

##### Step 5: (End Condition) Repeat step 2 until the lists are 2 or fewer elements. In our example the lists are done.  At 2 elements, we can check and sort manually.

  `Compare L2 elements --> 3 < 4; Done`

##### Step 6: Merge all the lists and the pivot values.

  `Merge L1 and the first pivot --> [1] + [2] = [1,2]`
  
  `Merge in L2 --> [1,2] + [3,4] = [1,2,3,4]`

### Implementation

  This is being left to the reader for now
