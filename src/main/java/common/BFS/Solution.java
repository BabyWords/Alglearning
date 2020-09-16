package common.BFS;

import common.TreeNode;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        TreeNode head=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        TreeNode five=new TreeNode(5);
        TreeNode six=new TreeNode(6);
        TreeNode seven=new TreeNode(7);
        head.right=three;
        head.left=second;
        second.right=five;
        second.left=four;
        three.right=seven;
        three.left=six;
        BroadFirstSearch(head);
//        System.out.println(levelOrder(head));
    }

    /**
     * 直接输出
     * @param nodeHead
     */
    //广度优先遍历是使用队列实现的
    public static void BroadFirstSearch(TreeNode nodeHead) {
        if (nodeHead == null) {
            return;
        }
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(nodeHead);
        while (!myQueue.isEmpty()) {
            TreeNode node = myQueue.poll();
            System.out.print(node.val + " ");
            if (null != node.left) {
                myQueue.add(node.left);    //深度优先遍历，我们在这里采用每一行从左到右遍历
            }
            if (null != node.right) {
                myQueue.add(node.right);
            }

        }
    }

    /**
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