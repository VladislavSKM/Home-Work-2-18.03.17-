//13.  � ������������ ����� ��������� ������������ ����� 13, � � �������� � 4. 
//����� �������������� �������� ���� ���������� ����� ����� ��������� ������ ������ �������,
//���������� ����� 4 ��� 13 (��������, 40123, 13313, 12345 ��� 13040), ����� �� ������� ����������� ������.
//���� � ������������ ����� ������� 100 ���. ������ ������ ������� � ������ ������ ������ ����� ����� �� 00001 �� 99999,
//�� ������� ����� ������� ������� ���������?
package HW1_13;

public class Number13 {
	 public static void main(String[] args){
	        int kol=0;
	        for(int i=4;i<=99994;i++){
	            String s=String.valueOf(i);
	            if(s.indexOf('4')!=-1){
	             kol++;
	            }
	            else if(s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
	              kol++;
	            }
	        }
	        System.out.println("c ������� 4 � 13 �������� ��������� "+kol+" �������");
	    }
}
