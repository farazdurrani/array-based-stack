import java.util.Arrays;

public class Stack {
    private int[] array;
    private int index;
    
    public Stack() {
	array = new int[100];
    }
    
    public void push(int value) {
	if(index > array.length) {
	    throw new RuntimeException("Stack is full");
	}
	array[index] = value;
	index++;
    }

    @Override
    public String toString() {
	return Arrays.toString(array);
    }
    
    
}
