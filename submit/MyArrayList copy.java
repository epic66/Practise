package myUtil;


public class MyArrayList<E> implements MyList<E> {

	private static final int DEFAULT_CAPACITY = 10;
	
	int size;  // non-private for testing purpose
	E [] elementData; // non-private for testing purpose
	
	/**
	 * Create an empty list of capacity capa
	 * 
	 * @param capa the initial capacity. Assume greater than 0.
	 */
	@SuppressWarnings({"unchecked"})
    public MyArrayList(int capa) {
		this.elementData = (E[])new Object [capa];
	}

	/**
	 * Create an empty list of default capacity
	 * 
	 */
    @SuppressWarnings({"unchecked"})
    public MyArrayList() {
		this.elementData = (E[])new Object [DEFAULT_CAPACITY];
	}
	@Override
	public int size() {
		return this.size;
		// TODO Auto-generated method stub
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		int i=0;
		if(this.elementData[i] == null && i<elementData.length) {
			i++;
			return true;
		}
		return false;
	}
	@Override
	public boolean contains(E o) {
		// TODO Auto-generated method stub
		for(int i = 0; i<elementData.length;i++) {
			if(o.equals(elementData[i])) {
				return true;
			}
		}
		return false;
	}
	@Override
	public void add(E o) {
		// TODO Auto-generated method stub
//		@SuppressWarnings("unchecked")
		if(elementData.length==this.size) {
			@SuppressWarnings("unchecked")
			E [] element = (E[])new Object [elementData.length+DEFAULT_CAPACITY];
			for(int i=0; i<elementData.length;i++) {
				element[i] = elementData[i];
			}
			element[elementData.length]=o;
			this.elementData = element;
			this.size++;
		}
		else {
			elementData[this.size] = o;
			this.size++;
		}
	}
	
	@Override
	public void remove(E o) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<this.size;i++) {
			if(elementData[i].equals(o)&&count<1) {
				for(int j=i; j<this.size-1;j++) {
					elementData[j] = elementData[j+1];
				}
				elementData[this.size-1]=null;
				this.size--;
				count++;
			}
		}
	}

	
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if(index<this.size) {
			for(int i=0; i<elementData.length;i++) {
				if(i==index) {
					return elementData[i];
				}
			}
		}
		throw new IndexOutOfBoundsException("");
	}
	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		if(index<this.size) {
			for(int i=0; i<elementData.length;i++) {
				if(i==index) {
					E previous = elementData[i];
					elementData[i] = element;
					return previous;
				}
			}
		}
		throw new IndexOutOfBoundsException("");
	}
	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("unchecked")
	//	@SuppressWarnings("unchecked")
		if(index>this.size||index<0) {
			throw new IndexOutOfBoundsException("");
		}
		else {
			if(elementData.length==this.size){
				@SuppressWarnings("unchecked")
				E []data1 = (E[])new Object [elementData.length+DEFAULT_CAPACITY];
				for(int i=0; i<this.size;i++) {
					data1[i] = elementData[i];
				}
				if(index == this.size) {
					data1[this.size] = element;
				}
				if(index<this.size) {
					for(int i=index; i<=this.size;i++) {
						if(i==index) {
							data1[i] = element;
						}else {
							data1[i] = elementData[i-1];
						}
						
					}
				}
				this.elementData = data1;
				this.size++;
			}else if(elementData.length>this.size) {
				@SuppressWarnings("unchecked")
				E []data2 = (E[])new Object[elementData.length];
				for(int i =0; i<this.size;i++) {
					data2[i] = elementData[i];
				}
				if(index == this.size) {
					data2[this.size] = element;
				}
				if(index<this.size) {
					for(int i=index;i<=this.size;i++) {
						if(i==index) {
							data2[i] = element;
						}else {
							data2[i
							      ] = elementData[i-1];
						}
					}
				}
				this.elementData = data2;
				this.size++;
			}		
		}
	}
	
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		if(index >= this.size||index<0) {
			throw new IndexOutOfBoundsException("");
		}
		
		else {
			E prev = this.elementData[index];
			this.remove(prev);
			return prev;
		}
	}
	@Override
	public int indexOf(E o) {
		// TODO Auto-generated method stub
		for(int i = 0;i<elementData.length;i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public int lastIndexOf(E o) {
		// TODO Auto-generated method stub
		for(int i = elementData.length-1;i>=0;i--) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

}
//int count = 0;
//for(int i=0; i<this.size;i++) {
//	if(i==index&&count<1) {
//		for(int j=index;j<this.size-1;j++) {
//			this.elementData[j] = this.elementData[j+1];
//		}
//		this.elementData[this.size-1] = null;
//		//this.size--;
//		count++;
//	}
//}