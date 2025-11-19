package Stack;

public class Stack {
	
    private Object[] elements;
    private int top;
    private int maxSize;

    public Stack(int maximalGroesse) {
        this.maxSize = maximalGroesse;
        this.elements = new Object[maximalGroesse];
        this.top = -1;
    }

    public void push(Object o) {
        if (top < maxSize - 1) {
            top++;
            elements[top] = o;
        } else {
            System.out.println("Stack ist voll. Element konnte nicht hinzugefügt werden.");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object popped = elements[top];
            elements[top] = null;
            top--;
            return popped;
        } else {
            System.out.println("Stack ist leer. Es gibt kein Element zum Entfernen.");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < maxSize; i++) {
            res += elements[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());

    }
}
