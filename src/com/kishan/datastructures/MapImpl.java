package com.kishan.datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Map implementation using java */

/**
 * @author Kishankumar Feb 25, 2020
 */
public class MapImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		standardMap();
		showMyMap();
	}
	
	static void showMyMap() {
		// MyMap
        MyMap<String, Integer> map = new MyMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 5);
        System.out.println(map.get("Lars"));
        for (int i = 0; i < 15; i++) {
            map.put(String.valueOf(i), i);
        }
        System.out.println(map.size());
        System.out.println(map.get("51"));
        Set keys = map.entryKey();
        keys.stream().forEach(a -> System.out.println("Key from MyMap::" + a));
	}
	
	static void standardMap() {
		// Standard Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Lars", 2);
        map.put("Lars", 6);
        System.out.println(map.get("Lars"));

        for (int i = 0; i < 15; i++) {
            map.put(String.valueOf(i), i);
        }
        System.out.println(map.size());

        System.out.println(map.get("51"));
        Set keys = map.keySet();
        keys.stream().forEach(a -> System.out.println("Key from standardMap::" + a));
	}
}

class MyMap<K, V> {
	int size;
	private final int DEFAULT_INITIAL_CAPACITY = 16;
	@SuppressWarnings("unchecked")
	MapEntry<K, V>[] values = new MapEntry[DEFAULT_INITIAL_CAPACITY];

	V get(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null && values[i].getKey().equals(key)) {
				return values[i].getValue();
			}
		}
		return null;
	}

	void put(K key, V val) {
		boolean insert = true;
		for (int i = 0; i < size; i++) {
			if (values[i] != null && values[i].getKey().equals(key)) {
				values[i].setValue(val);
				insert = false;
				break;
			}
		}
		if (insert) {
			checkCapacity();
			values[size++] = new MapEntry<K, V>(key, val);
		}
	}

	void remove(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null && values[i].getKey().equals(key)) {
				values[i] = null;
				size--;
				condenseArray(i);
			}
		}
	}

	void condenseArray(int start) {
		for (int i = start; i < size; i++) {
			values[i] = values[i + 1];
		}
	}

	void checkCapacity() {
		if (size == values.length) {
			int new_size = size * 2;
			values = Arrays.copyOf(values, new_size);
		}
	}

	int size() {
		return size;
	}

	Set<K> entryKey() {
		Set<K> set = new HashSet<K>();
		for (int i = 0; i < size; i++) {
			set.add(values[i].getKey());
		}
		return set;
	}
}

class MapEntry<K, V> {
	K key;
	V value;

	MapEntry(K key, V val) {
		this.key = key;
		this.value = val;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
}