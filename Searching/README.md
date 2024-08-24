# Searching

Searching is the process of finding a specific element within a collection of data such as an array, string, or any iterable data structure. The two most common searching algorithms are:

1. **Linear Search**
2. **Binary Search**

## Linear Search

In this type of search, we iterate through every element of the array or iterable data structure and check if the target element is present or not. The search is performed by running a loop over the array and comparing each element to the target.

### Time Complexity:

- **Best Case:** O(1) when the target is at the first position.
- **Worst Case:** O(n) when the target is not present or at the last position.
- **Space Complexity:** O(1).

## Binary Search

Binary search is a more efficient algorithm that works on sorted arrays. The idea is to divide the search space into two halves by repeatedly comparing the target element with the middle element of the array. Depending on the result of the comparison, we either eliminate the lower or upper half of the array and repeat the process.

### Steps:

1. Find the middle element of the array.
2. If the middle element is the target, return its index.
3. If the target is smaller than the middle element, search in the left half of the array.
4. If the target is greater than the middle element, search in the right half of the array.
5. Repeat the process until the target is found or the search space is exhausted.

### Time Complexity:

- **Best Case:** O(1) when the target is the middle element.
- **Average/Worst Case:** O(log n).
- **Space Complexity:** O(1) for iterative solutions, O(log n) for recursive solutions.

### Important Note:

Binary search only works on **sorted** arrays. If the array is not sorted, you need to sort it first (which can be done using algorithms like quicksort or mergesort) before applying binary search.
