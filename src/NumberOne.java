//1.      ������� ���������, ������� ����� ��������� ������ �� �������� ��������� �� ������� [5;155] ����� ����� � �������� (25;100) 
//� �������� ��������� �� �����.

//������� ������ ���������:

//����� 113 �� ���������� � ��������� (25,100)

import java.util.Random;
public class NumberOne {
	 public static void main(String args[]){
	    int a = 5;
	    int b = 155;
	    int c = (int) (Math.random()*a + Math.random()*b);
	       if(c >= 25 && c <= 100){
	        System.out.println("����� " + c + "  ���������� � ��������� (25,100)");
	        }
	        else{
	            System.out.println("����� " + c + " �� ���������� � ��������� (25,100)");
	         }
	    }
}