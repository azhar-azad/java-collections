package com.azad.learning.javacollections.arraylist;

import java.util.ArrayList;

/*
 * Author: Azad
 * Desc: Tried to make ArrayList class generic. 
 * NOT TESTED
 * NOT USED IN THIS PROJECT
 */
public class ArrayListGeneric<T> {

	private ArrayList<T> arrayList = new ArrayList<>();
	
	public void add(T element) {
		arrayList.add(element);
	}
	
	public void add(int index, T element) {
		arrayList.add(index, element);
	}
	
	public void remove(T element) {
		arrayList.remove(element);
	}
	
	public void remove(int index) {
		arrayList.remove(index);
	}
	
	public void set(int index, T element) {
		arrayList.set(index, element);
	}
	
	public T get(int index) {
		return arrayList.get(index);
	}
	
	public int indexOf(T element) {
		return arrayList.indexOf(element);
	}
	
	public int size() {
		return arrayList.size();
	}
	
	public boolean contains(T element) {
		return arrayList.contains(element);
	}
	
	public void clear() {
		arrayList.clear();
	}
}
