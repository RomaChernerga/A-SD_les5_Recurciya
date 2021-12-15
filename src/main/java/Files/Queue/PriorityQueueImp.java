package Files.Queue;

public class PriorityQueueImp<E extends Comparable<? super E>> implements Queue<E> {
    protected final E[]data;
    private  int size;

    public PriorityQueueImp(int maxSize) {
        this.data = (E[]) new Comparable[maxSize];
    }

    @Override
    public boolean insert(E value) {
        if (isFull()){  // если у нас все заполнено
            return false;
        }

        int index;
        for (index = size - 1; index >= 0 ; index--) {
            if(value.compareTo(data[index]) < 0) {
                data[index + 1] = data[index]; // сдвиг вправо позиции index
            } else {
                break;
            }
        }
        data[index + 1] = value; //на нужную ранее освободившуюся позицию подставляем наше значение
        size++;
        return true;
    }

    @Override
    public E remove() {
        return isEmpty() ? null: data[--size]; // проверка на null
    }

    @Override
    public E peekFront() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    // метод для построения итогового массива
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");  //создаем строку и открываем скобочку
        for (int i = 0; i < size; i++) { // пробегаемся от головы до хвоста массива
            sb.append(data[i]);
            if(i != size - 1) { // если наш индекс не равняется хвосту очереди, то добавляем запятую
                sb.append(",");
            }
        }
        sb.append("]"); //закрываем скобочку
        return sb.toString(); // выводим sb - массив
    }

    @Override
    public void display() {
        System.out.println(this);


    }
}
