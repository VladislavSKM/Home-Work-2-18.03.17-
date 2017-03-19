//4.      —оздайте программу, вывод€щую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 Е.
package HW1_13;

public class Number4 {
	public static void main(String[] args){
		for (int k=0,i=2;k<=19;k++,i*=2){
		System.out.println(k+"элемент равен "+i);
		}
		}
}
