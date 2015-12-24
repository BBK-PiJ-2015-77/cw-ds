public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	@Override
	public ReturnObject head() {
		if (size == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(head.getValue());
		}
	}
	
	@Override
	public FunctionalList rest() {
		FunctionalList newList = new FunctionalArrayList();
		if (isEmpty()) {
			return newList;
		}
		Node newHead = head.getNext();
		newList.add(newHead);
		for (int i = 0; i < size -1; i++) {
				newHead = newHead.getNext();
				newList.add(newHead);
			}
		return newList;
	}

}