package Files.Queue;

public class QueueImpl <E> implements Queue<E> {

    protected final int DEFAULT_TAIL = -1; // введение переменной - исходное значение хвоста массива
    protected final int DEFAULT_HEAD = 0;   // введение переменной - исходное значение головы массива

    protected final E[] data;
    protected int size;     // введение переменной - размер массива
    protected int tail;     // введение переменной - голова массива
    protected int head;     // введение переменной - голова массива

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = DEFAULT_TAIL;
        head = DEFAULT_HEAD;
    }


    @Override
    public boolean insert(E value) {
        if(isFull()) {
            return false;
        }
        if(tail == data.length - 1) { // Если упираемся хвостом очереди в последний индекс
            tail = DEFAULT_TAIL; // Обнуляем и возвращаемся к началу
        }

        data[++tail] = value; //сдвигаем показатель конца очереди добавляя новые элементы
        size++;

        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) { // проверить, пустой ли массив, и если да - вернуть null
            return null;
        }

        if(head == data.length) { // если головной элемент стал последним элементом
            head = DEFAULT_HEAD; // сбрасываем для первоначального значения, чтобы избежать ошибок
        }

        E value = data[head++]; // если массив не пустой, отдаем элемент на позиции head
        size--;     // уменьшаем размер

        return value;
    }

    @Override
    public E peekFront() {
        return data[head]; //показываем ближайший элемент
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

    // метод для построения итогового массива
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");  //создаем строку и открываем скобочку
        for (int i = head; i < tail; i++) { // пробегаемся от головы до хвоста массива
            sb.append(data[i]);
            if(i != tail) { // если наш индекс не равняется хвосту очереди, то добавляем запятую
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
