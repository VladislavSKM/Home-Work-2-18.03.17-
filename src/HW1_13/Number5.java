//5.      �������� ���������, ����������� ��������� ������������ ����� n, ������� ������������ ����� � ����������.
package HW1_13;
import java.util.Scanner;
public class Number5 {
	    public static void main(String[] args) {
	       int n;
	        do {
	            Scanner s = new Scanner(System.in);
	             System.out.print("������� ����������� ����� : ");
	              n = s.nextInt();
	               if(n < 0) {
	                   System.out.println("�� ����� �� ����������� ����� ");
	               } else {
	               int a = 1;
	                for (int i = 2; i <= n; i++)
	                  a *= i;
	                  System.out.println(" ��������� ����� "+n+" ����� "+a);
	                if (n == 0 || n == 1)
	                 System.out.println(a);
	             }
	        } while (n < 0);
	    }
	    }



