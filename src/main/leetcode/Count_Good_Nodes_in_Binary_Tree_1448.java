public class Count_Good_Nodes_in_Binary_Tree_1448 {
	private int count(TreeNode root, int max) {
		if (root == null) {
			return 0;
		}
		if (root.val >= max) {
			max = Math.max(root.val, max);
			return 1 + count(root.left, max) + count(root.right, max);
		} else {
			return count(root.left, max) + count(root.right, max);
		}

	}

	public int goodNodes(TreeNode root) {
		int max = root.val;
		return 1 + count(root.left, max) + count(root.right, max);
	}
}
