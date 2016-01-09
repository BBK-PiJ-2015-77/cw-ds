public class ArrayList implements List {
	
	/**
	 *	Some of the methods below will return a 'ReturnObject' - 
	 *	this will either return an object or an error message, 
	 *	{@see ReturnObject} for a  full description of this class.
	 */
	
	protected Object[] objArray;
	protected final static int DEFAULT_SIZE = 20;
	protected int numberOfElements;
	
	public ArrayList() {
		objArray = new Object[DEFAULT_SIZE];
		numberOfElements = 0;
	}

	/**
	 *	{@See List} for a full description of these methods
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
		if (numberOfElements == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= numberOfElements) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			return new ReturnObjectImpl(objArray[index]);
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
			
			ReturnObject delObject = new ReturnObjectImpl(objArray[index]);
			for (int position = index; position < numberOfElements; position++) {
				objArray[position] = objArray[position + 1];
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
			if (isNearlyFull()) {
				increaseArrayLength();
			}
			for(int position = numberOfElements; position > index; position--){
				objArray[position] = objArray[position - 1];
			}
			objArray[index] = item;
			numberOfElements++;
			return new ReturnObjectImpl(objArray[index]);
		}
	}
	
	@Override
	public ReturnObject add(Object item) {
		if (item == null) {
			//this isn't working correctly
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			if (isNearlyFull()) {
				increaseArrayLength();
			}
			objArray[numberOfElements] = item;
			numberOfElements++;
			return new ReturnObjectImpl(item);
		}
	}
	
	/**
	 *	This method will check if the array is nearly full
	 *	(with the intention of making the array bigger if it is,
	 *	using the increaseArrayLength method)
	 */
	
	public boolean isNearlyFull() {
		if (DEFAULT_SIZE - numberOfElements <=1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void increaseArrayLength() {
		Object[] newArray = new Object[numberOfElements * 2];
		for (int i = 0; i < numberOfElements; i++) {
			newArray[i] = objArray[i];
		}
		objArray = newArray;
	}

}