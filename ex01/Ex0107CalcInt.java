/*
 * �L�[�{�[�h������͂����l(int)�ɂ������Ďl�����Z�A�y�ї]�艉�Z���s��
 * FileName : Ex0107CalcInt.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
  import java.util.*;
 
 public class Ex0107CalcInt{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		int x;
		int y;
		
		System.out.print("x ���� : ");
		x = scan.nextInt();
		
		System.out.print("y ���� : ");
		y = scan.nextInt();
		System.out.println(x + " + " + y + "=" + (x + y));
		System.out.println(x + " - " + y + "=" + (x - y));
		System.out.println(x + " * " + y + "=" + (x * y));
		System.out.println(x + " / " + y + "=" + (x / y));
		System.out.println(x + " % " + y + "=" + (x % y));	
 	}
 }
 /*
 
 G:\�}�C�h���C�u\java1\EX01>javac Ex0107CalcInt.java
 G:\�}�C�h���C�u\java1\EX01>java Ex0107CalcInt
x ���� : 10
y ���� : 3
10 + 3=13
10 - 3=7
10 * 3=30
10 / 3=3
10 % 3=1

G:\�}�C�h���C�u\java1\EX01>
*/