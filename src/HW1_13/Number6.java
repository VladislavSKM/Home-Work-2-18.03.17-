//6.      �������� �� ����� ��� ������������� �������� ������������ �����, ��������� ������������� � ����������.
package HW1_13;
import  java.util.*;
public class Number6 {
	 public static void main(String[] args){
	   int a;
	     Scanner s=new Scanner(System.in);
	     System.out.println("������� ����������� ����� = ");
	       if(s.hasNextInt()){
	        a=s.nextInt();
            System.out.println("���������� ����� "+a+" �������� ");
	           for(int i=a;i>0;i--){
	              int b=a%i;
	              if(b==0)
	              System.out.print(i+";");
	            }
	        }
	              else System.out.println("��� �� �����");
	        
	 }
}
