package datastructures;

import java.util.Objects;

public class MyHashMap<K,V> {
    private static class Entry<K,V> { K k; V v; boolean used; Entry(K k,V v){this.k=k;this.v=v;this.used=true;} }
    private Entry<K,V>[] table;
    private int size = 0;
    private static final int DEFAULT=16;

    public MyHashMap() { table = (Entry<K,V>[]) new Entry[DEFAULT]; }

    public void put(K key, V value) {
        if (size * 2 >= table.length) resize();
        int idx = indexFor(key, table.length);
        while (table[idx] != null && table[idx].used) {
            if (Objects.equals(table[idx].k, key)) { table[idx].v = value; return; }
            idx = (idx + 1) % table.length;
        }
        table[idx] = new Entry<>(key, value);
        size++;
    }

    public V get(K key) {
        int idx = indexFor(key, table.length);
        while (table[idx] != null) {
            if (table[idx].used && Objects.equals(table[idx].k, key)) return table[idx].v;
            idx = (idx + 1) % table.length;
        }
        return null;
    }

    public int size() { return size; }

    private int indexFor(K key, int len) {
        return (key == null) ? 0 : (Math.abs(key.hashCode()) % len);
    }

    private void resize() {
        Entry<K,V>[] old = table;
        table = (Entry<K,V>[]) new Entry[old.length*2];
        size = 0;
        for (Entry<K,V> e : old) if (e != null && e.used) put(e.k, e.v);
    }
}
