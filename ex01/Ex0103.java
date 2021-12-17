/*
 * 基本演算と表示
 * FileName : Ex0103.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0103{
 	public static void main(String[] args){
		int a;
		int b;
		int c;
		
		a = 10;
		b = 20;
		
		c = a + b;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		System.out.println("(a + b) = " + (a + b));
		System.out.println("a + b = " + a + b);
		System.out.println( a + b);
 	}
 }
 /*
G:\マイドライブ\java1\EX01>javac Ex0103.java

G:\マイドライブ\java1\EX01>java Ex0103
a = 10 b = 20 c = 30
(a + b) = 30
a + b = 1020
30
G:\マイドライブ\java1\EX01>
println("(a + b) = " + (a + b))とした場合(a + b)はint型として演算される
println("a + b = " + a + b)とした場合 a + b は String型として演算される
println( a + b)とした場合 a + b は String型として演算される
	
*/