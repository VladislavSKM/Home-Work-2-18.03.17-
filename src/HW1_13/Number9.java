//9.��� ��������� ������������� � ���������� ������������ ����� ���������� ����� ���� ��� ���� (������� �� �������� ������� ���� ����� � �����).
package HW1_13;
import java.util.*;
public class Number9 {
	public static void main(String [] args){
        int n , s = 0;
        System.out.print("������� ����������� ����� : ");
        Scanner ska = new Scanner(System.in);
        n = ska.nextInt();
        while(n != 0){
            s = s + (n % 10);
            n/=10;
       }
        System.out.println("����� ���� ���� ����� = "+s);
    }
}


