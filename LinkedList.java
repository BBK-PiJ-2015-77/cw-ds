public class LinkedList implements List {

	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public ReturnObject get(int index){
		return null;
	}
	
	public ReturnObject remove(int index){
		return null;
	}
	
	public ReturnObject add(int index, Object item){
		return null;
	}
	
	public ReturnObject add(Object item){
		if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (head == null) {
			head = new Node(item);
			size++;
			return new ReturnObjectImpl(item);
		} else {
			Node position = head;
			while (position.getNext() != null) {
				position = position.getNext();
			}
			position.setNext(new Node(item));
			size++;
			return new ReturnObjectImpl(item);
		}
	}


}