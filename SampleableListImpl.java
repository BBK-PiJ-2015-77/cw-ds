public class SampleableListImpl extends ArrayList implements SampleableList {
	
	/**
	 *	{@see SampleableList} for description of the method below
	 */
	
	
	public SampleableList sample() {
		SampleableList sample = new SampleableListImpl();
		int length = size();
		for (int i = 0; i < length; i = i + 2) {
			Object objectToAdd = get(i).getReturnValue();
			sample.add(objectToAdd);
		}
		return sample;
	}
	
}
