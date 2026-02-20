package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila
    private int count = 0;

	public boolean isEmpty() {
		return top == null;
	}
	
	public void initStack(char value) {
		top = new Node(value, top, 0); 
	}

	public void push(char value) {
		top = new Node(value, top, count);
		count++;   // el nuevo nodo apunta al anterior
	}
	
	public int size() {
		return count;
	}

	public char pop() {
		if (isEmpty()) {
			//throw new IllegalStateException("Stack is empty");
			return '0';
		}
		char value = top.value;
		top = top.next;
		count--;
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack underflow");
		}
		return top.value;
	}


public Node getNodeInit() {
    if (isEmpty()) {
        return null;
    }

    Node current = top;
    while (current.next != null) {
        current = current.next;
    }
    return current;
}
}