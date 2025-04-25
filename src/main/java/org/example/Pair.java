package org.example;


public class Pair<K, V> {
    private K key;
    private V value;


    public Pair(K key, V value) {

        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }

    // Getter for the key
    public K getKey() {
        return key;
    }

    // Getter for the value
    public V getValue() {
        return value;
    }

    // Method to return a string representation of the Pair
    @Override
    public String toString() {
        return "→ (Key: " + key + ", Value: " + value + ")";
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }


        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Pair<?, ?> otherPair = (Pair<?, ?>) obj;

        return key.equals(otherPair.key) && value.equals(otherPair.value);
    }


    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }


    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }
}

