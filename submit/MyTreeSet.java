package myUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MyTreeSet<E> extends MyAbstractSet<E> {

	
	 
	protected TreeMap <E, Object> map;   // non-private for testing purposes
	
	// Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();
	
	
    /**
     * Constructs a new, empty set;  
     */
    public MyTreeSet() {
    	// COMPLETE THIS
    	map = new TreeMap<>();
    }
//    public MyTreeSet(int initialCapacity) {
//    	// COMPLETE THIS
//    	super();
//    	this.map = new TreeMap<>(initialCapacity);
//    }
    
    // addAll
	@Override
    public Iterator<E> iterator(){
		// COMPLETE THIS
		return this.map.keySet().iterator();    
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
			this.map.remove(o);
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
	
	
	 

}
