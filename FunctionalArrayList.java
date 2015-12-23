public class FunctionalArrayList extends ArrayList implements FunctionalList {

	@Override
	public ReturnObject head(){
		if (numberOfElements == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(intArray[0]);
		}
	}
	
	/**
     * Returns a list with the elements in this list except the
     * head. The elements must be in the same order. The original list
     * must not change or be affected by changes in the new list. 
     * 
     * If the list is empty, another empty list is returned. 
     */
	
	
	@Override
	public FunctionalList rest(){
		if (isEmpty()) {
			//not finished
			return null;
		} else {
		FunctionalList newList = new FunctionalArrayList();
		//going to have to use the add function
			for (int i = 1; i < numberOfElements; i++) {
				newList.add(intArray[i]);
			}
			return newList;
		}
	}

}