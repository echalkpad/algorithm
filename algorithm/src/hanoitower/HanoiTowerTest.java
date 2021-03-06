package hanoitower;

import java.util.Iterator;
import java.util.Scanner;

public class HanoiTowerTest {

	/**
	 * Hanoi Tower
	 * @param args
	 */
	public static void main(String[] args) {
		HanoiTowerTest hanoi = new HanoiTowerTest();
		Tower<Tray> from = new Tower(1, "Tower 1");
		Tower<Tray> middle = new Tower(2, "Tower 2");
		Tower<Tray> to = new Tower(3, "Tower 3");
		
		System.out.println("Input the number of trays.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i = number; i > 0; i--){
			Tray tray = new Tray(i, "Tray "+i);
			from.getStack().push(tray);
		}
		hanoi.hanoi(number, from, middle, to);
	}
	
	public <T> void hanoi(int num, Tower<T> from, Tower<T> middle, Tower<T> to){
		//System.out.println(num+"***");
		if(num == 1){
			this.move(from, middle, to);
			//System.out.println("A"+" "+num);
		} else{
			hanoi(num-1, from, to, middle);
			//System.out.println("B"+" "+num);
			this.move(from, middle, to);
			//System.out.println("C"+" "+num);
			hanoi(num-1, middle, from, to);
			//System.out.println("D"+" "+num);
		}
	}
	
	private <E> void move(Tower<E> from, Tower<E> middle, Tower<E> to){
		E tray = from.getStack().pop();
		to.getStack().push(tray);
		StringBuilder sb = new StringBuilder();  
	       sb.append("=====================Hanoi.move()======================\n")  
	       .append(" Move tray : ").append(((Tray)tray).getName())  
	       .append(" from ").append(from.getName()).append(" to ")  
	       .append(to.getName());  
	       System.out.println(sb.toString());  
	}
}
