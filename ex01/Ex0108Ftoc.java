/*
 * �L�[�{�[�h����؎����x����͂��A�ێ����x�ɕϊ�
 * FileName : Ex0108Ftoc.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 
   import java.util.*;
 
 public class Ex0108Ftoc{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int f;
		System.out.print("�؎����x���� : ");
		f = scan.nextInt();
		double c;
		c = (5 * ((double)f - 32)) / 9;
		System.out.println("�؎����x : "+ f + "==>�ێ����x : " + c);
 	}
 }
 /*
 G:\�}�C�h���C�u\java1\EX01>javac Ex0108Ftoc.java

G:\�}�C�h���C�u\java1\EX01>java Ex0108Ftoc
�؎����x���� : 80
�؎����x : 80==>�ێ����x : 26.666666666666668

G:\�}�C�h���C�u\java1\EX01>java Ex0108Ftoc
�؎����x���� : 0
�؎����x : 0==>�ێ����x : -17.77777777777778

G:\�}�C�h���C�u\java1\EX01>
*/