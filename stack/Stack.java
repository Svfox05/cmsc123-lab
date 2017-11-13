public class LinkedListStack {
	LinkedList Stack;

	public Stack() {
		linkedListStack = new LinkedList();
	}

	public void push(Object item) {
		linkedListStack.add(item, 0);
	}
	
	public E pop() {
		return linkedListStack.remove(0);
	}
	
	public E peek() {
		return linkedListStack.get(0);
	}
	
	public boolean isEmpty() {
		if(linkedListStack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return linkedListStack.size();
	}	
}
