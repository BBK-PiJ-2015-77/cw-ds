public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	/**
	 *	{@see FunctionalList} for description of the methods below
	 */
	
	@Override
	public ReturnObject head(){
		if (numberOfElements == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(objArray[0]);
		}
	}
	
	@Override
	public FunctionalList rest(){
		FunctionalList newList = new FunctionalArrayList();
		if (isEmpty()) {
			return newList;
		} else {
			for (int i = 1; i < numberOfElements; i++) {
				newList.add(objArray[i]);
			}
			return newList;
		}
	}

}