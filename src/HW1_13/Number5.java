//5.      Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
package HW1_13;
import java.util.Scanner;
public class Number5 {
	    public static void main(String[] args) {
	       int n;
	        do {
	            Scanner s = new Scanner(System.in);
	             System.out.print("Введите натуральное число : ");
	              n = s.nextInt();
	               if(n < 0) {
	                   System.out.println("Вы ввели не натуральное число ");
	               } else {
	               int a = 1;
	                for (int i = 2; i <= n; i++)
	                  a *= i;
	                  System.out.println(" факториал числа "+n+" равен "+a);
	                if (n == 0 || n == 1)
	                 System.out.println(a);
	             }
	        } while (n < 0);
	    }
	    }



