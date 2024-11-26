package GenericPractice;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);

        String[] intArray = {"Çağrı", "Altan", "Hello World"};
        printArray(intArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element :
                array) {
            System.out.println(element);
        }
    }
}

class Pair<K, V> {
    private K key;
    private V value;
    private Number number;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
