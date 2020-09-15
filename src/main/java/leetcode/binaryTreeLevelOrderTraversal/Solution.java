package leetcode.binaryTreeLevelOrderTraversal;

import conmon.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 102
 */
public class Solution {
    /** DFS
     * 按层次输出
     *  利用 DFS 达到 BFS 的效果,在 DFS 过程中记下 level,然后将结果按照 level 输出
     * @param root
     * @param level
     * @param results
     */
    private void travel(TreeNode root, int level, List<List<Integer>> results) {
        if (results.size() == level) {
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if (root.left != null) {
            travel(root.left, level + 1, results);
        }
        if (root.right != null) {
            travel(root.right, level + 1, results);
        }
    }



    /** BFS
     * 按层次输出
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        //初始化一个结果集,最终的的结果为{{111},{222}}所以是 List 嵌套 List
        List<List<Integer>> allResults = new ArrayList<>();
        //空值判断
        if (root == null) {
            return allResults;
        }
        //利用队列的特性,存放每一层需要遍历的节点,广度遍历
        Queue<TreeNode> nodes = new LinkedList<>();
        //初始化操作,下面才可以进行遍历
        nodes.add(root);
        while (!nodes.isEmpty()) {
            //获取树的总大小
            int size = nodes.size();
            //存放每一层的结果
            List<Integer> results = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                //从队列中弹出就加入结果集
                TreeNode node = nodes.poll();//重点.和上面那个写法不同的地方就在于是阿紫这个循环里面 poll 的
                results.add(node.val);
                //当前节点的左右节点加入队列,就是下一层
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            allResults.add(results);
        }
        return allResults;
    }
}
