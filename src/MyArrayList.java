/**
 * @author lees13
 * Create a version of ArrayList with add, get, size, and remove an element at index.
 */

public class MyArrayList {
	private Object[] list;
	private int current = -1;

	/*
	 * Default size for list is 10
	 * */
	public MyArrayList() {
		list = new Object[10];
	}
	
	/*
	 * Size of list is sent as a parameter
	 * */
	public MyArrayList(int size) {
		list = new Object[size];
	}
	
	/*
	 * Add to the list
	 * Increase size if needed
	 * */
	public Object add(Object o) {
		if(current + 1 == list.length) {
			increaseSize();
		}
		list[current + 1] = o;
		current++;
		return list[current];
	}
	
	/*
	 * Increase size of list by copying list into a list of 2x the size
	 * */	
	private void increaseSize() {
		Object[] temp = new Object[list.length * 2];
		for(int i = 0; i <= current; i++) { // copy old list to new list
			temp[i] = list[i];
		}
		list = temp; // change reference to new list
	}
	
	
	/*
	 * Return element at index
	 * */
	public Object get(int index) {
		if(index <= current && index >= 0)
			return list[index];
		return null;
	}
	
	/*
	 * Remove element at index
	 * */
	public Object remove(int index) {
		Object rm = list[index];
		Object[] temp = new Object[list.length];
		int i = 0, j = 0;
		if(index <= current && index >= 0) {
			while(i <= current){
				if(i == index)
					i++;
				
				temp[j] = list[i];
				
				i++;
				j++;
			}
			list = temp;
			current--;
			return rm; // remove successful
		}
		return null; // remove fails
	}
	
	/*
	 * Return size of list (number of elements)
	 * */
	private int size() {
		return current + 1;
	}
	
	/*
	 * Return actual size of array
	 * */
	private int actualSize() {
		return list.length;
	}
	
	public String toString() {
		String res = "";
		for(int i = 0; i <= current; i++) {
			res += list[i] + "\n";
		}
		return res;
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2); // create a list of size 2
		list.add(new Integer(1)); // add 1
		list.add(new Integer(6)); // add 6
		list.add(new Integer(4)); // add 4
		System.out.println(list);
		
		list.remove(1); // remove index 1 which is element 6
		System.out.println(list);
		
		list.add(5); // add 5
		System.out.println(list);
	}
}
