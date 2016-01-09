public class StackImpl extends AbstractStack {

	/**
	 *	{@see AbstractStack}  and {@see Stack} for a 
	 *	description of the methods below
	 *
	 *	I have used a {@see LinkedList} as the underlying
	 *	data structure
	 */

    List lList = new LinkedList();
	
	public StackImpl(List lList) {
		super(lList);
	}
    
    public boolean isEmpty(){
    	return lList.isEmpty();
    }
    
    public int size() {
    	return lList.size();
    }
    
    public void push(Object item) {
    	lList.add(item);
    }
    
    public ReturnObject top() {
    	if (lList.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		return lList.get(lList.size() - 1);
    	}
    }
    
    public ReturnObject pop() {
    	if (lList.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		ReturnObject delObject = lList.get(lList.size()-1);
    		lList.remove(lList.size()-1);
    		return delObject;
    	}
    }
	
}
