import java.util.ArrayList;

public class Leaf_Similar_Trees_872 {
	private void leaves(TreeNode root, ArrayList<Integer> arr) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			arr.add(root.val);
			return;
		}
		leaves(root.left, arr);
		leaves(root.right, arr);
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		leaves(root1, arr1);
		leaves(root2, arr2);
		return arr1.equals(arr2);
	}
}
