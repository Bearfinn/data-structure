
public class LinkList {
	private Node first;
	public LinkList() {
		first = null;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void insert(int id, double dd) {
		Node n = new Node(id, dd);
		Node i = first;
		while (i != null) {
			i = i.next;
		}
		i = n;
	}
	public Node getFirst() {
		return first;
	}
}
