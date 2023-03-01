package com.vialfinaz14.Chapter11_InheritanceAndPolymorphis.Latihan;

import java.util.ArrayList;

public class Listing10_MyStack {
    private ArrayList<Object> list = new ArrayList<>();
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getsize() {
        return list.size();
    }
    public Object Peek() {
        return list.get(getsize() - 1);
    }
    public Object pop() {
        Object o = list.get(getsize() - 1);
        list.remove(getsize() - 1);
        return o;
    }
    public void push(Object o) {
        list.add(o);
    }
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
