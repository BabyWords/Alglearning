package common.DFS;


import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null) {
            return allResults;
        }
        travel(root, 0, allResults);
        return allResults;
    }

    /**
     * 按层次输出.递归写法
     * 利用 DFS 达到 BFS 的效果,在 DFS 过程中记下 level,然后将结果按照 level 输出
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

    /**
     * 直接输出,stack+循环
     *
     * @param nodeHead
     */
    //深度优先遍历
    public void depthFirstSearch(TreeNode nodeHead) {
        if (nodeHead == null) {
            return;
        }
        Stack<TreeNode> myStack = new Stack<>();
        myStack.add(nodeHead);
        while (!myStack.isEmpty()) {
            TreeNode node = myStack.pop();    //弹出栈顶元素
            System.out.print(node.val + " ");
            if (node.right != null) {
                myStack.push(node.right);    //深度优先遍历，先遍历左边，后遍历右边,栈先进后出
            }
            if (node.left != null) {
                myStack.push(node.left);
            }
        }
    }
}
