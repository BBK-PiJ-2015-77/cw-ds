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
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			Node position = head;
			for (int i = 0; i < index; i++) {
				position = position.getNext();
			}
			return new ReturnObjectImpl(position.getValue());
		}
	}
	
	public ReturnObject remove(int index){
		return null;
	}
	
	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (head == null) {
			head = new Node(item);
			size++;
			return new ReturnObjectImpl(item);
		} else {
			Node newNode = new Node(item);
			Node newPlus = head;
			Node newMinus = null;
			for (int i = 0; i < index; i++) {
				newMinus = newPlus;
				newPlus = newPlus.getNext();
			}
			newNode.setNext(newPlus);
			newMinus.setNext(newNode);
			size++;
			return new ReturnObjectImpl(item);
		}
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