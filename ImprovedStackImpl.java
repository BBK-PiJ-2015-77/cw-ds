public class ImprovedStackImpl implements ImprovedStack {
	
	protected List improvedStack;
	
	public ImprovedStackImpl(List list) {
		this.improvedStack = list;
	}
	
	public boolean isEmpty() {
		return improvedStack.isEmpty();
	}
	
	public int size() {
		return improvedStack.size();
	}
	
	public void push(Object item) {
		improvedStack.add(item);
	}
	
	public ReturnObject top() {
		if (improvedStack.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		return improvedStack.get(improvedStack.size() - 1);
    	}
	}
	
	
	public ReturnObject pop() {
		if (improvedStack.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		ReturnObject delObject = improvedStack.get(improvedStack.size()-1);
    		improvedStack.remove(improvedStack.size()-1);
    		return delObject;
    	}
	}
	
	/**
	 * Classes implementing this interface must use a {@see List} as the
 	 * underlying data structure to store the elements on the stack. 
	 */
	 
	public ImprovedStack reverse() {
		List reverseList = new LinkedList();
		int length = improvedStack.size();
		for (int i = (length - 1); i >= 0; i--) {
			Object objectToAdd = improvedStack.get(i).getReturnValue();
			reverseList.add(objectToAdd);
		}
		ImprovedStack reverseStack = new ImprovedStackImpl(reverseList);
		return reverseStack;
	}
	
	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object) {
		int length = improvedStack.size();
		for (int i = 0; i < length; i++) {
			if (object.equals(improvedStack.get(i).getReturnValue())) {
				improvedStack.remove(i);
			}
		}
	}
	
}