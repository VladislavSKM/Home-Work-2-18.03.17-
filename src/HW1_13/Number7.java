//7.      Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым. 
//Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, 
//что число составное и проверку продолжать не нужно). Также учтите, что наименьший делитель натурального числа n, 
//если он вообще имеется,обязательно располагается в отрезке [2; √n].
package HW1_13;
import  java.util.*;
public class Number7 {
	public static void main(String[] args)
	{
		int a=0;
		Scanner str = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		if(str.hasNextInt())
		   a=str.nextInt();
		for(int i=2; i<Math.floor(a);i++)
		{
			if(a%i==0||i!=1)
			{
				System.out.println("Это число - составное.");
				return;
			}
		}
		System.out.println("Это число - простое.");
	}
}
