//3. �� ��������� ����������� ������� ������ ������ ����������, 
//�� ����� �������� ������������ ���������� ������, ���������� �� ����� �������� ���. 
//����� ������� ���� ���������� ����� � 9 ����� ���� � ����� ���������� �28800� (�.�. ������� 8 �����), 
//����� ������� 14:30 � �� ����� �9000� (�.�. ������� ��� � ��������� ����),
//� ����� ��������� 17 ����� � �� ����� ������������ �0� (�.�. ������� ���� ����������).

//����������� ������ �������, ��� �������� ������� ���������� � �� �������� ��������� ������� �������� ��� � ��������. ������ �������� ������ ����������� � �������� ���������, ������� ������ ������ ����� �������� �� ����� �������� ����� � ����������� � ���, ������� ������ ����� �������� �� ����� �������� ���. ��������: ��������� 7 �����, ��������� 4 ����, �������� 1 ���, ��������� ����� ����.

//����, � ���������� n ������ ������������ ��������� (�� ����� ������������ ���������) ����� ����� �� [0;28800], ����� ��� ������ ���������� �� ����� (��� �������) � �� ��������� ������ (��� ���������) ������ ���������� ����� � ���������� ������ �����, ������������ � n ��������.

//������� ������ ���������:

//23466

//�������� 6 �����

import java.util.*;
public class NumberThree {
		 public static void main(String[] args){
		        Random rnd=new Random();
		        int a= rnd.nextInt(28800);
		        int b=a/60/60;
		        System.out.println(a);
		        switch(b){
		            case 0:
		                System.out.println("�������� ����� ����");
		                break;
		            case 1:
		                System.out.println("������� "+b+" ���");
		                break; 
		            case 2:
		            case 3:	
		            case 4:
		                System.out.println("�������� "+b+" ����");
		                break;
		            default:
		                System.out.println("�������� "+b+ " �����");
		        }
		    }
		    }


