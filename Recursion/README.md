# Recursion

Recursion is a method where a function calls itself to solve smaller instances of the same problem. It helps in breaking down complex problems into simpler subproblems. Recursion must have a base case to avoid infinite loops.

## Types of Recursion

1. **Direct Recursion**  
   A function directly calls itself until the base case is reached.  
   Example: Calculating factorial.

2. **Indirect Recursion**  
   A function calls another function, which in turn calls the original function, creating a cycle of calls.

3. **Tail Recursion**  
   The recursive call is the last statement in the function. It is more memory-efficient as it allows for stack frame reuse.

4. **Tree Recursion**  
   A function makes multiple recursive calls, resulting in a tree-like structure.  
   Example: Fibonacci series calculation.

5. **Backtracking Recursion**  
   Recursion is used to explore possibilities and backtrack if the current path doesn’t lead to a solution.  
   Example: Solving mazes or puzzles.

## Key Points

- Always define a **base case** to stop recursion.
- Recursion can be inefficient without optimization, such as **memoization**.
- Tail recursion is preferred when possible to optimize memory usage.
