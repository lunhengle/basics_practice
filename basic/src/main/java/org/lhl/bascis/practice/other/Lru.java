package org.lhl.bascis.practice.other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 基于linkedHashMap实现lru lasted recently used
 *
 * @param <K>
 * @param <V>
 */
public class Lru<K, V> extends LinkedHashMap<K, V> implements Map<K, V> {
    public Lru(int initialCapacity,
               float loadFactor,
               boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    public boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > 6;
    }

    public static void main(String[] args) {
        Lru<Character, Integer> lru = new Lru(16, 0.75f, true);
        String str = "dafagagaqteta";
        for (int i = 0; i < str.length(); i++) {
            lru.put(str.charAt(i), i);
        }
        System.out.println(lru.get('e'));
        System.out.println(lru);
    }
}
