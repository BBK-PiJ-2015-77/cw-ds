public class FunctionalArrayList extends ArrayList implements FunctionalList {

	@Override
	public ReturnObject head(){
		if (numberOfElements == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			return new ReturnObjectImpl(intArray[0]);
		}
	}
	
	@Override
	public FunctionalList rest(){
		FunctionalList newList = new FunctionalArrayList();
		if (isEmpty()) {
			return newList;
		} else {
			for (int i = 1; i < numberOfElements; i++) {
				newList.add(intArray[i]);
			}
			return newList;
		}
	}

}