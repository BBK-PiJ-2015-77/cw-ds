public class ArrayList implements List {

	private Object[] intArray;
	private final static int DEFAULT_SIZE = 20;
	private int numberOfElements;
	
	public ArrayList() {
		intArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}
	
	//this class needs to return an object {@see ReturnObject} or an error message as defined in ErrorMessage


	/**
	 *	{@See List} for a description of these methods
	 */	
	
	@Override
	public boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	@Override
	public int size() {
		return numberOfElements;
	}
	
	@Override
	public ReturnObject get(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(intArray[index]);
		}
	}
	
	//doesn't work when removing index 0
	@Override
	public ReturnObject remove(int index) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (numberOfElements == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			/**
			 *	created a 'holder' (delObject) for the item being deleted
			 *	so that the removal of the item can be carried out and
			 *	then this item can be returned.
			 */
			
			ReturnObject delObject = new ReturnObjectImpl(intArray[index]);
			for (int position = index; position < numberOfElements; position++) {
				intArray[position] = intArray[position + 1];
			}
			numberOfElements--;
			return delObject;
		}
		
	}
	
	@Override
	public ReturnObject add(int index, Object item) {
		if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			//this isn't working correctly
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			for(int position = numberOfElements; position > index; position--){
				intArray[position] = intArray[position - 1];
			}
			intArray[index] = item;
			numberOfElements++;
			return new ReturnObjectImpl(intArray[index]);
		}
	}
	
	@Override
	public ReturnObject add(Object item) {
		if (item == null) {
			//this isn't working correctly
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			intArray[numberOfElements] = item;
			numberOfElements++;
			return new ReturnObjectImpl(item);
		}
	}
	
	/**
	 *	This method will check if the array is nearly full
	 *	(with the intention of making the array bigger if it is,
	 *	using the arrayDoubler method)
	 */
	
	public boolean isNearlyFull() {
		if (DEFAULT_SIZE - numberOfElements <=1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean arrayDoubler {
		Object[] newArray = new Object[
	}

}