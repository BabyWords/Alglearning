package leetcode.nAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


class Solution {
    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> integerList = new ArrayList<Integer>();
        helper(root, integerList);
        return integerList;
    }

    public void helper(Node root, List<Integer> arrayList) {
        if (root == null) {
            return;
        }
        arrayList.add(root.val);
        //关键就是吧每一个节点都需要去遍历他的 children
        for (Node nodes : root.children) {
            helper(nodes, arrayList);
        }
    }

    /**
     * 迭代
     * 保证栈中的元素是当前这个 root,通过栈保存 root 然后通过 for 循环去遍历这个 root
     * 外层在套一个 While 一个 root 一个 root 更新
     * @param root
     * @return
     */
    public List<Integer> preorder2(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            //头结点加入结果集
            res.add(cur.val);
            //将该节点的子节点从右往左压入栈
            List<Node> nodeList = cur.children;
            for (int i = nodeList.size() - 1; i >= 0; i--) {
                stack.push(nodeList.get(i));
            }
        }
        return res;
    }


}