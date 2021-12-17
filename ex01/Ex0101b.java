/*
 * 基本データ型と値boolean, byte, String
 * FileName : Ex0101b.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0101b{
 	public static void main(String[] args){
 	// --------boolean
	boolean a;
	
	System.out.println("boolean型のデータ");
	a = true;
	System.out.println("\t true = " + a);
	a = false;
	System.out.println("\t false = " + a);
	
	// -------byte
	byte b;
	
	System.out.println("byte型のデータ");
	b = 127;
	System.out.println("\t 127 = " + b);
	b = -128;
	System.out.println("\t -128 = " + b);
	b = 128;
	System.out.println("\t 128 = " + b);
	
	//---------String
	String s;
	
	System.out.println("String型のデータ");
	s = "abc";
	System.out.println("\t\"abc\"        =" + s);
	
	int len = s.length();
	System.out.println("\t s.length() = " + len);
	}
	 
 
 
 }
 /*
 G:\マイドライブ\java1\EX01>javac Ex0101b.java

G:\マイドライブ\java1\EX01>java Ex0101b
boolean型のデータ
         true = true
         false = false
byte型のデータ
         127 = 127
         -128 = -128
String型のデータ
        "abc"        =abc
         s.length() = 3

G:\マイドライブ\java1\EX01>
*/
/*
G:\マイドライブ\java1\EX01>javac Ex0101b.java
Ex0101b.java:26: エラー: 不適合な型: 精度が失われる可能性があるintからbyteへの変換
        b = 128;
            ^
エラー1個
*/