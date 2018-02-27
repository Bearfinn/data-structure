import java.util.ArrayList;

public class TreeNode {
	int value;
	ArrayList<TreeNode> child;
	
	public TreeNode(int value) {
		this.value = value;
	}
	
	public void add(TreeNode tn) {
		child.add(tn);
	}
	
	public ArrayList<TreeNode> getChild() {
		return child;
	}
}
