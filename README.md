# MergeSort
# In this we divide an array to several smaller arrays and we sort the arrays and merge them simultaneously which makes this sorting method much faster.
# In the sort method we recursively call itself by first calculating the midpoint of the subarray and passing that as the right parameter while keeping the l same. Then after it reaches the base condition we do the same for the right array where we take m+1 as left and r as the right parameter.
# After we have divided the array till the base case where the array is divided into n sub arrays where n is the size of the array, we call merge on these individual n array for logn times precisely to again built to the size of the original array while sorting it.
# Thus this is how merge sort is performed.
# Best & Worst case both turn out to be - O(nLogn)
# To make this algorithm sort in descending order just change the sign on line 34 to >=.
