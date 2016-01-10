public class ImprovedStackImpl implements ImprovedStack {
	
	/**
 	 *	{@see Stack} for a description of the methods below,
 	 *	unless indicated otherwise
	 */
	
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
 	 *	{@see AbstractStack} for a description of the methods below
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
	
	public void remove(Object object) {
		int length = improvedStack.size();
		for (int i = 0; i < length; i++) {
			if (object.equals(improvedStack.get(i).getReturnValue())) {
				improvedStack.remove(i);
			}
		}
	}
	
	
}