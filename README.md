# Mixed Data Structure Problems in Java

This repository contains implementations of **advanced problems** across LinkedList, Stack, Queue, and Arrays in Java.  
Each problem is designed to strengthen understanding of data structures and prepare for coding interviews.

---

## 📌 Problems

### 🔹 Linked List
1. **Binary Search in a Linked List**  
   - **Problem**: Perform binary search on a sorted linked list.  
   - **Challenge**: Unlike arrays, linked lists do not support random access.  
   - **Approach**:  
     - Use **slow/fast pointers** to find the middle node.  
     - Compare middle node with the target.  
     - Recursively search in left or right half.  

---

### 🔹 Stack
2. **Sort a Stack using Recursion**  
   - **Problem**: Sort elements of a stack in ascending order using recursion only.  
   - **Constraint**: No extra data structures allowed.  
   - **Approach**:  
     - Pop elements recursively.  
     - Insert each element back in sorted order.  

---

### 🔹 Queue
3. **Queue Reversal**  
   - **Problem**: Reverse the elements of a queue.  
   - **Approach**:  
     - **Method 1**: Use a stack to reverse.  
     - **Method 2**: Use recursion (remove element, reverse rest, insert back).  

5. **Sort a Queue using Stack**  
   - **Problem**: Sort a queue in ascending order using only a stack as auxiliary space.  
   - **Approach**:  
     - Dequeue elements and push into stack in sorted order.  
     - Transfer back to queue.  

---

### 🔹 Array
4. **Search in Rotated Sorted Array**  
   - **Problem**: Given a rotated sorted array, search for a target element.  
   - **Example**:  
     Input → `[4, 5, 6, 7, 0, 1, 2], target = 0`  
     Output → `Index = 4`  
   - **Approach**:  
     - Use **modified binary search**.  
     - Identify sorted half of the array.  
     - Decide whether to search left or right half.  

---
