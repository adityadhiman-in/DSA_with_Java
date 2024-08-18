# Sorting Algorithms

Sorting is the process of arranging data in a particular order, typically in ascending or descending sequence. It is a fundamental concept in computer science used in many applications.

## Types of Sorting Techniques

### Bubble Sort

Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.  
**Time Complexity:**

- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

### Selection Sort

Selection Sort divides the list into sorted and unsorted parts. It repeatedly selects the smallest (or largest) element from the unsorted part and swaps it with the first unsorted element.  
**Time Complexity:**

- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)

### Insertion Sort

Insertion Sort builds the final sorted array one item at a time. It picks an element from the unsorted part and places it at the correct position in the sorted part.  
**Time Complexity:**

- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

### Quick Sort

Quick Sort selects a 'pivot' element and partitions the array such that elements less than the pivot are on the left and elements greater than the pivot are on the right. It recursively applies the same logic to the subarrays.  
**Time Complexity:**

- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)

### Merge Sort

Merge Sort is a divide-and-conquer algorithm that splits the array into halves, recursively sorts each half, and then merges the sorted halves back together.  
**Time Complexity:**

- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)
