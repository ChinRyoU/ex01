/*
 * キーボードから華氏温度を入力し、摂氏温度に変換
 * FileName : Ex0108Ftoc.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 
   import java.util.*;
 
 public class Ex0108Ftoc{
 	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int f;
		System.out.print("華氏温度入力 : ");
		f = scan.nextInt();
		double c;
		c = (5 * ((double)f - 32)) / 9;
		System.out.println("華氏温度 : "+ f + "==>摂氏温度 : " + c);
 	}
 }
 /*
 G:\マイドライブ\java1\EX01>javac Ex0108Ftoc.java

G:\マイドライブ\java1\EX01>java Ex0108Ftoc
華氏温度入力 : 80
華氏温度 : 80==>摂氏温度 : 26.666666666666668

G:\マイドライブ\java1\EX01>java Ex0108Ftoc
華氏温度入力 : 0
華氏温度 : 0==>摂氏温度 : -17.77777777777778

G:\マイドライブ\java1\EX01>
*/