import java.util.LinkedList;
import java.util.Queue;

public class TreeSearch {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		TreeNode tree2 = new TreeNode(1);
		tree2.add(new TreeNode(2));
		tree2.add(new TreeNode(3));
		tree2.add(tree);
		
		TreeSearch ts = new TreeSearch();
		ts.BFS(tree);
	}
	
	public void BFS(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode v = queue.remove();
			System.out.println(v.value + " -> ");
			for (TreeNode w : v.getChild()) {
				queue.add(w);
			}
		}
	}
}
