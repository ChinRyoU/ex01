/*
 * �L�[�{�[�h������͂����l��Double�^�Ƃ��Ĉ���
 * FileName : Ex0106ScanDouble.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
  import java.util.*;
 
 public class Ex0106ScanDouble{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		double x;
		double y;
		
		System.out.print("x ���� : ");
		str = scan.next();
		x   = Double.parseDouble(str);
		
		System.out.print("y ���� : ");
		y = scan.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
 	}
 }
 /*
 G:\�}�C�h���C�u\java1\EX01>javac Ex0106ScanDouble.java

G:\�}�C�h���C�u\java1\EX01>java Ex0106ScanDouble
x ���� : 10
y ���� : 3
x = 10.0
y = 3.0

G:\�}�C�h���C�u\java1\EX01>java Ex0106ScanDouble
x ���� : 10
y ���� : 3.5
x = 10.0
y = 3.5

G:\�}�C�h���C�u\java1\EX01>java Ex0106ScanDouble
x ���� : 1.2
y ���� : 3.5
x = 1.2
y = 3.5

G:\�}�C�h���C�u\java1\EX01>
*/