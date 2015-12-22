public class Node {

	private Object ob;
	private Node nextNode;
	
	public Node (Object ob) {
		this.ob = ob;
		this.nextNode = null;
	}
	
	public Object getValue() {
		return ob;
	}
	
	public Node getNext() {
		return nextNode;
	}
	
	public void setNext(Node newNode) {
		this.nextNode = newNode;
	}
	
}