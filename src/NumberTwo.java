//2.      ������� ���������, ��������� �� ����� �������� ��������������� ���������� ����������� ����� � ��� ���������� �����.

//������� ������ ���������:

//� ����� 208 ���������� ����� 8
import java.util.Random;
public class NumberTwo {
	 public static void main(String[] args){
	        Random r=new Random();
	        int a= (int)r.nextInt(999);
	        int b=a%10;
	        int c=(a/10)%10;
	        int d=(a/100)%10;
	          if(b>=c & b>d||b>c & b>=d){
	            System.out.println("� ����� "+a+" ���������� ����� " +b);
	          }
	          else {
	             if (c>b & c>=d||c>=b & c>d) {
	                System.out.println("� ����� "+a+" ���������� ����� " +c);
	             }
	             else {
	                System.out.println("� ����� "+a+" ���������� ����� " +d);
	             }
	              } 
 }

}
