//Given the root of a binary tree, return the preorder traversal of its nodes' v
//alues. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [1,2,3]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [1,2]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//
// Follow up: 
//
// Recursive solution is trivial, could you do it iteratively? 
//
// 
// Related Topics Stack Tree 
// 👍 1773 👎 66


//leetcode submit region begin(Prohibit modification and deletion)

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//
//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<>();
//            preorder(root, res);
//            return res;
//        }
//
//        private void preorder(TreeNode root, List<Integer> res){
//            if(root != null){
//                res.add(root.val);
//                preorder(root.left, res);
//                preorder(root.right, res);
//            }
//        }
//    }


//class Solution {
//    List<Integer> ans = new LinkedList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        preOrder(root);
//        return ans;
//    }
//    private void preOrder(TreeNode node) {
//        if (node == null) return;
//        ans.add(node.val);
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//}

//leetcode submit region end(Prohibit modification and deletion)


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       LinkedList<TreeNode> stack = new LinkedList<>();
       LinkedList<Integer> output = new LinkedList<>();

       if(root == null){
           return  output;
       }

       stack.add(output);
       while (!stack.isEmpty()){
           TreeNode node  = stack.pollLast();
           output.add(node.val);

           if(node.right != null){
               stack.add(node.right);
           }

           if(node.left != null){
               stack.add(node.left);
           }
       }
       return output;
    }
}