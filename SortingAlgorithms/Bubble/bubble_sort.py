#!/usr/bin/python
# Bubble sort implementation. Tutorial for Liberty Commons High School HP Club.


def bubblize(target):
    """ 
       Sort list of values using bubble sort technique.
    :param 'target': [list] of any data type that you want to sort,
                    integers, floats, strings...
    :return: [list] sorted target.
    """
    step = 1
    is_Sorted = False
    while not is_Sorted:
        is_Sorted = True
        for pos in range(len(target)-1):
            if target[pos] > target[pos + 1]: 
                swap(target, pos)
                is_Sorted = False;
	if (not(is_Sorted)):
	    print 'step ' + str(step) + ':  %s' % (target)
	step += 1
    return target


def swap(target, curr_pos):
    """ 
     Swap elements in the 'target' list with current position and the next
    position in the list.
    :param 'target': [list] of elements to swap.
    :param 'curr_pos': [int] position of element to swap.
    """
    tmp = target[curr_pos]
    target[curr_pos] = target[curr_pos + 1]
    target[curr_pos + 1] = tmp 


origin = [4,7,1,5,2,6,3]
print "Before:  %s" % (origin)
bubblize(origin)
print "After:   %s" % (origin)
