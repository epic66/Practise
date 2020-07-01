package myUtil;

import java.util.HashMap;
import java.util.Iterator;

public class MyHashSet<E> extends MyAbstractSet<E> {

	
	protected HashMap <E, Object> map;   // non-private for testing purposes
	
	/** Dummy value to associate with an Object in the backing Map
	    used as values for all the keys in the backing Map
	*/
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set; 
     */
    public MyHashSet() {
        map = new HashMap<>();
    }
    
    /**
	 * Create an empty set of default capacity
	 * 
	 */
    public MyHashSet(int initialCapacity) {
        super(); // can be skipped
    	this.map = new HashMap<>(initialCapacity);
    }
    
     
	@Override
    public Iterator<E> iterator(){
    	return map.keySet().iterator();
    }
       
	@Override
	public boolean contains(E o) { 
		// COMPLETE THIS
		if(this.map.containsKey(o)) {
			return true;
		}
		return false;
	}
	
	@Override
	// Hint. add e into map as key, with the Dummy object PRESENT as value.
	// Hint. look Map API for the return type of put
	public boolean add(E e) { 
		// COMPLETE THIS
		if(!this.map.containsKey(e)) {
			this.map.put(e, PRESENT);
			this.size++;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean remove(E o) {
		// COMPLETE THIS
		if(this.map.containsKey(o)) {
			map.remove(o);
			this.size--;
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// COMPLETE THIS
		if(!this.map.isEmpty()) {
			this.map.clear();
			this.size = 0;
		}
	}
	
	//Other methods, such as the following size(), isEmpty(), addAll(), toString()  are inherited from MyAbstractSet
     
	    
	 


}
