public class ReturnObjectImpl implements ReturnObject {
	
	private Object obj;
	private ErrorMessage em;
	
	public ReturnObjectImpl(Object obj) {
		this.obj = obj;
		this.em = ErrorMessage.NO_ERROR;
	}
	
	public ReturnObjectImpl(ErrorMessage em){
		this.em = em;
		this.obj = null;
	}
	
	/**
	 *	{@see ReturnObject} for description of the methods below
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