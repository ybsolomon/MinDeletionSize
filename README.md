# MinDeletionSize

Runtime and Space Analysis:
- minDeletionSize:
  - Runtime = O(n^2) because there is a double for loop that can run at most n^2 times
  - Space = O(n) only four variables are initialized within each of the for loops and one boolean is initialized, but for every time an element is added, another variable is added to the arraylist
- main: 
  - Runtime = O(n^2) because only two other lines of code, both O(1), are executed in main besides minDeletionSize()
  - Space = O(n) because only two variables are initialized in main, but the space of minDeletionSize = O(n)
