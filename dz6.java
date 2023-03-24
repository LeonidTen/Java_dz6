// Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
//*Реализовать все методы из семинара.
//Формат данных Integer.

import java.util.ArrayList;

public class HashSet {
    private ArrayList<Integer> elements;

    public HashSet() {
        this.elements = new ArrayList<>();
    }

    public boolean add(int element) {
        if (!this.contains(element)) {
            this.elements.add(element);
            return true;
        }
        return false;
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i) == element) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(int element) {
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i) == element) {
                this.elements.remove(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.elements.size();
    }

    public void clear() {
        this.elements.clear();
    }

    public int get(int index) {
        return this.elements.get(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.elements.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.elements.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}