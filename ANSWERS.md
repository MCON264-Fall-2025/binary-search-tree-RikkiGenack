1. Why does inorder traversal of a BST return elements in sorted order?
    Inorder traversal goes from the left to the root to the right. 
    The left is smaller than the root, and the right is larger, so inorder traversal returns 
    elements in ascending order. 
2. Give an example of an insertion order that produces a highly unbalanced BST.
   Inserting elements in sorted order, e.g., 1, 2, 3, 4, 5, 
   creates a tree that degenerates into a linked list (all nodes have only right children).
3. What does the inorder traversal look like for that tree?
   Inorder traversal: 1, 2, 3, 4, 5 (same as insertion order).
4. In your own words, explain the differences between:

Recursive vs iterative traversal
    Recursive traversal calls itself for each node, iterative visits the nodes so it's more 
    complicated to write the code.
Depth-first vs breadth-first traversal
    Depth-first goes as far as a branch can go and uses a stack. Breadth-first goes 
    level by level and uses a queue. 
When might you prefer a breadth-first traversal in a real application?
    If you have a navigation application, using breadth-first allows you to get the shortest path
    from the root to the node you are looking for. 

I had AI give me information for my answers, but I used my own words except for questions 2 and 3. 