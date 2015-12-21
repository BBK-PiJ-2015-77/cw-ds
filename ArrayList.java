public class ArrayList implements List {

	private Object[] intArray;
	private final static int DEFAULT_SIZE = 20;
	private long numberOfElements;
	
	public ArrayList() {
		intArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}
	
	//this class needs to return an object {@see ReturnObject} or an error message as defined in ErrorMessage


	/*
	 *	{@See List} for a description of these methods
	 */	
	
	@Override
	public boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(intArray[index]); //? not sure what index is here - it is the parameter
		}
	}
	
	@Override
	public ReturnObject remove(int index) {
		return null;
	}
	
	@Override
	public ReturnObject add(int index, Object item) {
		return null;
	}
	
	@Override
	public ReturnObject add(Object item) {
		return null;
	}

}