package leetcode.lowestCommonAncestorOfABinaryTree;

public class Solution {
    /**
     * 找公共的最近节点,即找到使得 q , p 分别在两侧的 root 节点
     * 递归解法:
     * 每次一都去看当前节点左右两边是否存在 p 或者 q,看是否都能找到,并且在左右两边,然后再按照情况判断:
     * 1.如果都能找到,则这个 node 就是最近祖先
     * 2.如果是 null,就没找到
     * 3.如果只有一边找到,一边是 null,则不是 null 的就是最近祖先
     * @param node
     * @param p
     * @param q
     * @return
     */
        public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q){
            if (node==null||node==p||node==q){
                return node;
            }
            //找当前 node 节点左边是否有p 或者 q (观察上面的 if 是如何返回的,如果找到就返回)
            TreeNode left=lowestCommonAncestor(node.left,p,q);
            //找当前 node 节点右边是否有p 或者 q
            TreeNode right=lowestCommonAncestor(node.right, p, q);
            //下面就根据找的结果来判断最近祖先是哪个
            if (left == null && right == null) {
                return null;
            }
            if (left == null ) {
                return right;
            }
            if (right == null) {
                return left;
            }
            return node;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

