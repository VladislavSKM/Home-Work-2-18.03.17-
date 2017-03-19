//6.      Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
package HW1_13;
import  java.util.*;
public class Number6 {
	 public static void main(String[] args){
	   int a;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Введите натуральное число = ");
	       if(s.hasNextInt()){
	        a=s.nextInt();
            System.out.println("Делителями числа "+a+" являются ");
	           for(int i=a;i>0;i--){
	              int b=a%i;
	              if(b==0)
	              System.out.print(i+";");
	            }
	        }
	              else System.out.println("Это не число");
	        
	 }
}
