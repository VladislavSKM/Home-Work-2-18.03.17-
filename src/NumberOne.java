//1.      Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) 
//и сообщать результат на экран.

//Примеры работы программы:

//Число 113 не содержится в интервале (25,100)

import java.util.Random;
public class NumberOne {
	 public static void main(String args[]){
	    int a = 5;
	    int b = 155;
	    int c = (int) (Math.random()*a + Math.random()*b);
	       if(c >= 25 && c <= 100){
	        System.out.println("Число " + c + "  содержится в интервале (25,100)");
	        }
	        else{
	            System.out.println("Число " + c + " не содержится в интервале (25,100)");
	         }
	    }
}