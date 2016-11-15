## Learning To Bubble in Python

### Introduction

 Bubble sort is a well known sorting algorithm that is mainly used as an introduction to sorting algorithms due to its simplicity and inefficiency in the "real world" applications.

 Note: it is possible to use this algorithm in combination with other, more efficient approaches, or spice it up with tweaks and tricks, however it is still will loose to other "big boys" such as Merge, Heap or even Selection search.

### Concept

 Repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.

##### Example

Given [2,4,1,3]

###### Step 1: Take most left element in the list and move it to the right until it is smaller than the next element in the list or it hits the end of the list.

 `Compare 4 --> 2; 4 > 2 --> swap = [2,4,1,3]`

 `Compare 4 --> 1; 4 > 1 --> swap = [2,1,4,3]`

 `Compare 4 --> 3; 4 > 3 --> swap = [2,1,3,4]`

###### Step 2: Since first element is not in the right place, start moving it until sorted.

 `Compare 2 --> 1; 2 > 1; 2 --> swap = [1,2,3,4]`

 `Compare 2 --> 3; 2 < 3; 2 --> NoSwap = [1,2,3,4]`

###### Step 3 (The End Condition): Repeeat step 1 with each element until no swap is performed for the very last element in the list.

### Implementation

(for the full script look at bubble_sort.py script in this directory)

Lets start of with "Shebang" line.

    1 #!/usr/bin/python

 This line tells your system which interpreter to use to run this file. If you ommit this line, you will have to explicitelly use an interpreter
to run this script, e.g. python bubble_sort.py. With this line in place you can call this script as simple as ./bubble_sort.py

Note: make sure chmod +x bubble_sort.by flag is set on this script.

For more details read wiki:
https://en.wikipedia.org/wiki/Shebang_%28Unix%29

***
     2 # Bubble sort implementation. Tutorial for Liberty Commons High School HP Club.

 This is a Docstring for this whole file that brifelly describes what is that you are trying to acomplish with this script. Always write Docstrings for your scripts, functions, classes and etc. It is a good programming practice to document your code, not just for others to better understand what are you doing, but also for yourself.
It is very common for programmer to say "What was I thinking" when reading their own code. Documentation helps to solve that problem...

***

     5 def bubblize(target):
     6     """
     7        Sort list of values using bubble sort technique.
     8     :param 'target': [list] of any data type that you want to sort,
     9                     integers, floats, strings...
    10     :return: [list] sorted target.
    11     """

 Line 4 is a 'function defenition' with its name 'bubbleize' and parameter 'target'.
Don't forget a Docstring for your functino (line 6-11).

***

    12     is_Sorted = False

 Flag that controlls the 'while' loop. Will tell the algorithm to stop when the list
is sorted.

***

     13     while not is_Sorted:
     14         is_Sorted = True

 Line 13: Start 'while' with 'not is_Sorted' paramemetr, meaning it will execute block of code untill 'is_Sorted' variable is not set to 'True'.
 Line 14: assume we are done sorting and if we are not, the 'is_Sorted' will be changed to 'False' later in the code.

***

     15         for pos in range(len(target)-1):

 We don't want each element to travel to the very end of the list, because if list is of size 4 and element that we are moving is in position 3 (don't forget the list positioning starts from 0, not 1), then comparing it to position 4 will break your program - out of bounds. Thus, we stop at position one less then the end of the list: `len(target)-1`

Note: this For loop will be ran at least N times, where N is the size of the 'target' list.

***

     16             if target[pos] > target[pos + 1]:

 'pos' variable is the integer position of the element in the list that we want to move\sort around the list. Thus, we compare current position with the next position in the list. If condition is satisfied - swap elements.

***

     17                 swap(target, pos)

 Note that we do not assign swap() function to any value since we want to modify 'target' list, e.g target = swap(target, pos). This is because in python everything is passed by "reference", thus, whatever happenes in the "swap" function with 'target' list, it will be affected globaly on the variable.
 Lets jump to 'swap' function implementation.
***

     22 def swap(target, curr_pos):
     23     """
     24      Swap elements in the 'target' list with current position and the next
     25     position in the list.
     26     :param 'target': [list] of elements to swap.
     27     :param 'curr_pos': [int] position of element to swap.
     28     """
     29     tmp = target[curr_pos]
     30     target[curr_pos] = target[curr_pos + 1]
     31     target[curr_pos + 1] = tmp

 Line 29: before swapping, we need to save element in the current position, since it will be overriten and lost by line 30. After the next element in the list is assigned to current position, we can take saved element and assigne to the next position - swap performed.
 Lets get back to 'bubblize' function/

***

     18                 is_Sorted = False;

 Swap was performed, therefore list was modified, therefore we can't guarantee the list is sorted yet - have to run from the beginning again.

***

     19     return target

 When list is sorted, 'is_Sorted' variable set to true and we exited the While loop, we can return sorted list back to the "caller" of this function.
 Lets take a look how and who called this function.

***

     34 origin = [4,7,1,5,2,6,3]
     35 print "Before: %s" % (origin)
     36 bubblize(origin)
     37 print "After: %s" % (origin)

 There is no space indentation, therefore this will be ran by the compiler first.

Line 34: we define a list that we want to sort.
Line 35: just an output to the terminal for us to see what we are dealing with.
Line 36: calling 'bubblize' function and passing the 'origin' list that we want to sort.
Line 37: output to the terminal to see the result of bubble sort algorithm.


Run script as follows:

    ./bubble_sort.py
 
 or
 
    python bubble_sort.py

#### Algorithm Complexity

 Big-O notation describes behavior of the function. Don't worry about it for now. This is something you will see in Computer Science (or Mathematics) to describe algorithm complexity. I just wanted to mention this for you to be familiar with the concept and notation. For more information on Big-O read wiki: https://en.wikipedia.org/wiki/Big_O_notation

Worst case: O(N^2) - when we need to loop through the list\array twice as much as there are elements in it.
Average case: O(n^2)
Best: O(n) - when need to loop through exactky N times as much as there are N elements in the list\array.


### Conclusion

 Bubble sort algorithm is a very simple conceptually to understand(in compare to other algorithms)  as well as to implement. Since it takes in average to loop twice more as there are elements in the list, it makes this algorithm very impractical in the real life applications.

 In the next tutorial we will slightly modify this code so it could take input arguments from user to sort lists 'on demand'. Also, will take a look at "pdb" debugging tool and take a look into the process in real time execution.

[ Algorithm in action - lego visualisation ] (https://www.youtube.com/watch?v=MtcrEhrt_K0)


Feel free to ask questions or report any bugs in code or text you've noticed.
