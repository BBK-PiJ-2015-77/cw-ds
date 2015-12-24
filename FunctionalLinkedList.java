public class FunctionalLinkedList extends LinkedList implements FunctionalList {
	
	@Override
	public ReturnObject head() {
		if (size == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(head.getValue());
		}
	}
	
	/**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     *
     *	TM: create a new list copying the elements of the previous list.
     */
	
	@Override
	public FunctionalList rest() {
		//if isEmpty()
		FunctionalList newList = new FunctionalArrayList();
		Node newHead = head.getNext();
		newList.add(newHead);
		for (int i = 0; i < size -1; i++) {
				newHead = newHead.getNext();
				newList.add(newHead);
			}
		return newList;
	}

}