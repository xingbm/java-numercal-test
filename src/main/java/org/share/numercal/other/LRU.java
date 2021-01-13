package org.share.numercal.other;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xingbm on 2021/1/13 23:38
 */
public class LRU<K,V> {

    private static final float hashLoadFactory = 0.75f;
    private LinkedHashMap<K,V> map;
    private int cacheSize;

    public LRU(int cacheSize) {

        this.cacheSize = cacheSize;

        int capacity = (int)Math.ceil(cacheSize / hashLoadFactory) + 1;

        map = new LinkedHashMap<K,V>(capacity, hashLoadFactory, true) {
            private static final long serialVersionUID = 1;
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > LRU.this.cacheSize;
            }
        };
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void clear() {
        map.clear();
    }

    public synchronized int usedSize() {
        return map.size();
    }

    public void print() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

    public static void main(String[] args) {
        LRU lru = new LRU<String, Object>(5);
        lru.put(1, 0);
        lru.put(2, 1);
        lru.put(5, 3);
        lru.put(4, 5);
        lru.put(3, 6);
        lru.put(9, 1);
        lru.print();
    }

}
