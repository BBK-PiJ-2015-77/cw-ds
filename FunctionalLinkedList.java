public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	/**
	 *	{@see FunctionalList} for description of the methods below
	 */
	
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
		FunctionalList newList = new FunctionalLinkedList();
		if (isEmpty()) {
			return newList;
		} else {
			Node newHead = head.getNext();
			newList.add(newHead.getValue());
			for (int i = 1; i < size -1; i++) {
				newHead = newHead.getNext();
				newList.add(newHead.getValue());
			}
			return newList;
		}
	}
	//does the new list have to meet all the error criteria as the first list?

}