package Files.Stack;

public class StackImpl <E> implements  Stack <E>{

    private final E[] data;  // объявляем массив куда будем добавлять
    private int size;

    public StackImpl(int maxSize) {
        this.data = (E[])new Object[ maxSize];
    }


    @Override
    public void push(E value) {
        data[size++] = value;

    }

    @Override
    public E pop() {
        E value = peek();
        data[--size] = null;
        return value;
    }

    @Override
    public E peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this); // вызываем этот же класс
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = size - 1; i >= 0; i--) {  // идем от конца, т.к. добавляем с конца
            sb.append(data[i]); // добавляем каждый след элемент в сроку вывода
            if(i > 0) {
                sb.append(", "); // если элемент не последний, добавляем запятую
            }
        }
        sb.append("]");
        return sb.toString() ;
    }
}
