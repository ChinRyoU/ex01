/*
 * キーボードから入力した値をint型として扱う
 * FileName : Ex0105ScanInt.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 import java.util.*;
 
 public class Ex0105ScanInt{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str;
		int x;
		int y;
		
		System.out.print("x 入力 : ");
		str = scan.next();
		x   = Integer.parseInt(str);
		
		System.out.print("y 入力 : ");
		y = scan.nextInt();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
 	}
 }
 
 /*
 G:\マイドライブ\java1\EX01>javac Ex0105ScanInt.java

G:\マイドライブ\java1\EX01>java Ex0105ScanInt
x 入力 : 10
y 入力 : 3
x = 10
y = 3

G:\マイドライブ\java1\EX01>java Ex0105ScanInt
x 入力 : 10
y 入力 : 3.5
Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Scanner.java:864)
        at java.util.Scanner.next(Scanner.java:1485)
        at java.util.Scanner.nextInt(Scanner.java:2117)
        at java.util.Scanner.nextInt(Scanner.java:2076)
        at Ex0105ScanInt.main(Ex0105ScanInt.java:21)

G:\マイドライブ\java1\EX01>java Ex0105ScanInt
x 入力 : 1a
Exception in thread "main" java.lang.NumberFormatException: For input string: "1a"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Ex0105ScanInt.main(Ex0105ScanInt.java:18)

G:\マイドライブ\java1\EX01>
*/