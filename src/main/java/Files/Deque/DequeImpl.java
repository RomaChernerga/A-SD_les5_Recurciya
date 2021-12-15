//package Files.Deque;
//
//import Queue.QueueImpl;
//
//import java.util.Collection;
//import java.util.Iterator;
//
//public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>{
//
//
//    public DequeImpl(int maxSize) {
//        super(maxSize);
//    }
//
//    @Override
//    public boolean insertLeft(E value) {
//        if (isFull()) {
//            return false;
//        }
//        if (head == DEFAULT_HEAD)
//            head = data.length;
//
//        data[--head] = value;
//        size++;
//
//        return true;
//    }
//
//    @Override
//    public boolean insertRight(E value) {
//        return super.insert(value);
//    }
//    @Override
//    public void display() {
//        System.out.println(this);
//
//
//    }
//
//    @Override
//    public E removeLeft() {
//        return super.remove();
//    }
//
//    @Override
//    public E removeRight() {
//        if (isEmpty()) {
//            return  null;
//        }
//        if (tail == DEFAULT_TAIL)
//            tail = data.length - 1;
//
//        size--;
//        return data[tail--];
//    }
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("[");  //создаем строку и открываем скобочку
//        for (int i = head; i < tail; i++) { // пробегаемся от головы до хвоста массива
//            sb.append(data[i]);
//            if(i != tail) { // если наш индекс не равняется хвосту очереди, то добавляем запятую
//                sb.append(",");
//            }
//        }
//        sb.append("]"); //закрываем скобочку
//        return sb.toString(); // выводим sb - массив
//    }
//
//    @Override
//    public E peekLeft() {
//        return null;
//    }
//
//    @Override
//    public E peekRight() {
//        return null;
//    }
//
//    @Override
//    public void addFirst(E value) {
//
//    }
//
//    @Override
//    public void addLast(E value) {
//
//    }
//
//    @Override
//    public boolean offerFirst(E e) {
//        return false;
//    }
//
//    @Override
//    public boolean offerLast(E e) {
//        return false;
//    }
//
//    @Override
//    public E removeFirst() {
//        return null;
//    }
//
//    @Override
//    public E removeLast() {
//        return null;
//    }
//
//
//
//    @Override
//    public E pollFirst() {
//        return null;
//    }
//
//    @Override
//    public E pollLast() {
//        return null;
//    }
//
//    @Override
//    public E getFirst() {
//        return null;
//    }
//
//    @Override
//    public E getLast() {
//        return null;
//    }
//
//    @Override
//    public E peekFirst() {
//        return null;
//    }
//
//    @Override
//    public E peekLast() {
//        return null;
//    }
//
//    @Override
//    public boolean removeFirstOccurrence(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean removeLastOccurrence(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean add(E e) {
//        return false;
//    }
//
//    @Override
//    public boolean offer(E e) {
//        return false;
//    }
//
//    @Override
//    public E poll() {
//        return null;
//    }
//
//    @Override
//    public E element() {
//        return null;
//    }
//
//    @Override
//    public E peek() {
//        return null;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends E> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public void push(E e) {
//
//    }
//
//    @Override
//    public E pop() {
//        return null;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a) {
//        return null;
//    }
//
//    @Override
//    public Iterator<E> descendingIterator() {
//        return null;
//    }
//}
