public class StackImpl extends AbstractStack {

	//AbstractStack is an abstract class - not an interface
    
    // there is a list already accessible from AbstractStack:
    // protected List internalList;
    
    List lList = new LinkedList();
	
	public StackImpl(List lList) {
		super(lList);
	}
    
    /**
     *	Must implement the methods of {@see Stack} that have been
     *	left out of the abstract class {@see AbstractStack}.
     */
    
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