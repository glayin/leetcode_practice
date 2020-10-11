//Given the root of a binary tree, return the inorder traversal of its nodes' va
//lues. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [1,3,2]
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
//Output: [2,1]
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
// Related Topics Hash Table Stack Tree 
// 👍 3715 👎 155


//leetcode submit region begin(Prohibit modification and deletion)



import java.util.ArrayList;
import java.util.Deque;
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
//    List<Integer> ans = new LinkedList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        inorder(root);
//        return ans;
//    }
//    private void inorder(TreeNode node){
//        if(node == null)  return;
//        inorder(node.left);
//        ans.add(node.val);
//        inorder(node.right);
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stack1 = new LinkedList<TreeNode>();
        while ( root != null || !stack1.isEmpty()){
            while (root != null){
                stack1.push(root);
                root = root.left;
            }
            root = stack1.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}