//1.      —оздайте программу, вывод€щую на экран все четырЄхзначные числа последовательности 1000 1003 1006 1009 1012 1015 Е.
package HW1_13;

public class Number1 {
public static void main(String[] args){
	int a = 1000;
	do {
		a=a+3;
		System.out.println(a);
	}while(a<=9996);
}
}