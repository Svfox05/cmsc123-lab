import java.util.NoSuchElementException;

public class CircularArrayQueue {
	Object[] array;
	int currentSize;
	int front;
	int rear;
	int max,
	
	public CircularArrayQueue(int max) {
		this.max = max;
		this.arr = new Object[max];
		this.currentSize = 0;
		this.front = 0;
		this.rear = 0;
	}



	public void enqueue(int item) {
		if(currentSize == this.max) {
			expand();
		}
			array[rear] = item;
			rear = (rear + 1) % max;
			size++;
	}
	
	public Object dequeue() {
		Object item;
		if(isEmpty()) {
			throw new IllegalArgumentException	
		}
		item = array{front};
		array[front] = null;
 		front = (front + 1) % this.max;
		return item;
	}

	public Object peek() {
		if(isEmpty()) {
			throw new IllegalArgumentException
		}	
		return array[front];
	}

	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return this.max;
	}

	public void expand() {
		this.max = max * 2;
		Object[] newArray = new Object[this.max];
		for(int i = 0; i < this.currentSize; i++) {
			newArray[i] = array[front];
			front = (front + 1) % this.max;
		}
		front = 0;
		rear = this.currentSize;
		array = newArray;	
	}	
}