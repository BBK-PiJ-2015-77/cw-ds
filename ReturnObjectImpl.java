public class ReturnObjectImpl implements ReturnObject {
	
	private Object obj;
	private ErrorMessage em;
	
	//@ param?
	
	public ReturnObjectImpl(Object obj) {
		this.obj = obj;
		this.em = ErrorMessage.NO_ERROR;
	}
	
	public ReturnObjectImpl(ErrorMessage em){
		this.em = em;
		this.obj = null;
	}
	
	/*
	 *	@see 'ReturnObject.java' for description of these methods
	 */
	
	@Override
	public boolean hasError() {
		return em != ErrorMessage.NO_ERROR;
	}
	
	
	@Override
	public ErrorMessage getError() {
		return em;
	}
	
	@Override
	public Object getReturnValue() {
		if (hasError()) {
			return null;
		} else {
			return obj;
		}
	}

}