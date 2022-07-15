package com.sportradar.Utils;

import java.lang.reflect.GenericDeclaration;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair() {

    }
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void add(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setKey(K k) {
        this.key = k;
    }
    public void setValue(V v) {
        this.value = v;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair p = (Pair) obj;
            boolean keyCompare = getKey().equals(p.getKey());
            boolean valueCompare = getValue().equals(p.getValue());

            return keyCompare && valueCompare;

        } else {
            return super.equals(obj);
        }
    }

}
