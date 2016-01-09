public class LinkedList implements List {
	
	/**
	 *	Some of the methods below will return a {@see ReturnObject} - 
	 *	this will either return an object or an {@see ErrorMesage}, 
	 */
	
	protected Node head;
	protected int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	/**
	 *	{@See List} for a full description of these methods
	 */	
	
	@Override
	public boolean isEmpty(){
		return size == 0;
	}
	
	@Override
	public int size(){
		return size;
	}
	
	@Override
	public ReturnObject get(int index){
		if (size == 0){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			Node position = head;
			for (int i = 0; i < index; i++) {
				position = position.getNext();
			}
			return new ReturnObjectImpl(position.getValue());
		}
	}
	
	@Override
	public ReturnObject remove(int index){
		if (size == 0){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (index == 0 && size != 1) {
			head = head.getNext();
			size--;
			return new ReturnObjectImpl(head.getValue());
		} else if (index == 0 && size == 1) {
			ReturnObject first = new ReturnObjectImpl(head.getValue());
			head = null;
			size--;
			return first;
		} else {
			Node position = head;
			Node positionMinus = null;
			for (int i = 0; i < index; i++) {
				positionMinus = position;
				position = position.getNext();
			}
			positionMinus.setNext(position.getNext());
			size--;
			return new ReturnObjectImpl(position.getValue());
		}
	}

	@Override
	public ReturnObject add(int index, Object item){
		if (index < 0 || index >= size) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (size == 0) {
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
	
	@Override
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