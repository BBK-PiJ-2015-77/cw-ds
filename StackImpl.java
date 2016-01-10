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
    
    @Override
    public boolean isEmpty(){
    	return lList.isEmpty();
    }
    
    @Override
    public int size() {
    	return lList.size();
    }
    
    @Override
    public void push(Object item) {
    	lList.add(item);
    }
    
    @Override
    public ReturnObject top() {
    	if (lList.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		return lList.get(lList.size() - 1);
    	}
    }
    
    @Override
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
