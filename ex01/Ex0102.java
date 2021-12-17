/*
 * 定数のデフォルトの型
 * FileName : Ex0102.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0102{
 	public static void main(String[] args){
		int a;
		long b;
		long c;
		float d;
		
		a = 10;
		b = 30;
		c = 10000000000L;
		d = 1.23F;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);		
		System.out.println("d = " + d);		
 	}
 }
 
 /*
 Ex0102.java:16: エラー: 整数10000000000が大きすぎます
                c = 10000000000;
 Ex0102.java:17: エラー: 不適合な型: 精度が失われる可能性があるdoubleからfloatへの変換
                d = 1.23;
                    ^
エラー2個
*/
/*
G:\マイドライブ\java1\EX01>javac Ex0102.java

G:\マイドライブ\java1\EX01>java Ex0102
a = 10
b = 30
c = 10000000000
d = 1.23

G:\マイドライブ\java1\EX01>
*/