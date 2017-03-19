//9.Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
package HW1_13;
import java.util.*;
public class Number9 {
	public static void main(String [] args){
        int n , s = 0;
        System.out.print("Введите натуральное число : ");
        Scanner ska = new Scanner(System.in);
        n = ska.nextInt();
        while(n != 0){
            s = s + (n % 10);
            n/=10;
       }
        System.out.println("Сумма всех цифр числа = "+s);
    }
}


