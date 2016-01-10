public class StackImpl extends AbstractStack {

	/**
	 *	{@see AbstractStack}  and {@see Stack} for a 
	 *	description of the methods below
	 *
	 *	The List 'internalList' is a protected List from
	 *	{@see AbstractStack}
	 */
	
	public StackImpl(List list) {
		super(list);
	}
    
    @Override
    public boolean isEmpty(){
    	return internalList.isEmpty();
    }
    
    @Override
    public int size() {
    	return internalList.size();
    }
    
    @Override
    public void push(Object item) {
    	internalList.add(item);
    }
    
    @Override
    public ReturnObject top() {
    	if (internalList.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		return internalList.get(internalList.size() - 1);
    	}
    }
    
    @Override
    public ReturnObject pop() {
    	if (internalList.size() == 0) {
    		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    	} else {
    		ReturnObject delObject = internalList.get(internalList.size()-1);
    		internalList.remove(internalList.size()-1);
    		return delObject;
    	}
    }
	
}
