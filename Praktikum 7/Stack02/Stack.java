package Stack02;

public class Stack {
    public int size;
    public char[] data;
    public int top;

    public Stack(int size){
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size - 1);
    }

    public void push(char dt){
        if (!isFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char temp = data[top];
            top--;
            return temp;
        } else {
            return '\0';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return '\0';
        }
    }
}