package hanoitower;

import java.util.Stack;

public class Tower<E> {
	private int number; // number of tower
	private String name; // name of tower
	private Stack<E> stack = new Stack();
	public Tower(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public Stack<E> getStack() {
		return stack;
	}
	
}
