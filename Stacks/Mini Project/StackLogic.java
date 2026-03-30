class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow." + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
        } else {
            int value = stackArray[top--];
            System.out.println(value + " popped from stack.");
        }
    }

    public void peek() {
        if (top < 0) {
            System.out.println("Stack is empty! Nothing to peek.");
        } else {
            System.out.println("Top element is: " + stackArray[top]);
        }
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
