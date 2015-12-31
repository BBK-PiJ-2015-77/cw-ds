public class SampleableListImpl extends ArrayList implements SampleableList {
	
	/**
	 * Returns a list containing the first, third, fifth...
	 * items of this list, or an empty list if the list is empty. 
	 * 
	 * @return a list containing the first, third, fifth... items of this list
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