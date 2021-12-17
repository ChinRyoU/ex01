/*
 * キーボードから入力した値(int)にたいして四則演算、及び余り演算を行う
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
		
		System.out.print("x 入力 : ");
		x = scan.nextInt();
		
		System.out.print("y 入力 : ");
		y = scan.nextInt();
		System.out.println(x + " + " + y + "=" + (x + y));
		System.out.println(x + " - " + y + "=" + (x - y));
		System.out.println(x + " * " + y + "=" + (x * y));
		System.out.println(x + " / " + y + "=" + (x / y));
		System.out.println(x + " % " + y + "=" + (x % y));	
 	}
 }
 /*
 
 G:\マイドライブ\java1\EX01>javac Ex0107CalcInt.java
 G:\マイドライブ\java1\EX01>java Ex0107CalcInt
x 入力 : 10
y 入力 : 3
10 + 3=13
10 - 3=7
10 * 3=30
10 / 3=3
10 % 3=1

G:\マイドライブ\java1\EX01>
*/