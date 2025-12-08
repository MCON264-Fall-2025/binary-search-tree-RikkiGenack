package bst;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalExercises {

    // Iterative preorder using a stack
    public static <T extends Comparable<T>> List<T> preorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        stack.push(root);
        while (!(stack.isEmpty())){
            TreeNode<T> node = stack.pop();
            result.add(node.value); if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    // Iterative inorder using a stack
    public static <T extends Comparable<T>> List<T> inorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        TreeNode<T> curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            TreeNode<T> tn= stack.pop();
            result.add(tn.value);
           curr=tn.right;
        }

        return result;
    }

    // Optional / challenge: iterative postorder
    public static <T extends Comparable<T>> List<T> postorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO (challenge): implement iterative postorder
        // You may use two stacks, or one stack with a previous-node pointer.
        return result;
    }

    // Practice version of level-order
    public static <T extends Comparable<T>> List<T> levelOrderUsingQueue(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
          TreeNode<T> tn = queue.remove();
            result.add(tn.value);
            if(tn.left!=null){
               queue.add(tn.left);
            }
            if(tn.right!=null){
                queue.add(tn.right);
            }
        }
        return result;
    }
}

