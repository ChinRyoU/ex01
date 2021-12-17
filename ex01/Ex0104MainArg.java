/*
 * マンドライン引数より、データを渡す
 * FileName : Ex0104MainArg.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0104MainArg{
 	public static void main(String[] args){
		System.out.println("args.length = " + args.length);
		System.out.println("args[0] = " + args[0]);
		System.out.println("args[1] = " + args[1]);
		System.out.println("args[2] = " + args[2]);
		System.out.println("(args[1] + args[2]) = " + (args[1] + args[2]));
		
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		System.out.println("a = " + a);
        System.out.println("b = " + b);
		System.out.println("a + b =" + (a + b));
 	}
 }
 /*
G:\マイドライブ\java1\EX01>javac Ex0104MainArg.java

G:\マイドライブ\java1\EX01>java Ex0104MainArg abc 10 30
args.length = 3
args[0] = abc
args[1] = 10
args[2] = 30
(args[1] + args[2]) = 1030
a = 10
b = 30
a + b =40

G:\マイドライブ\java1\EX01>java Ex0104MainArg def 20.5 40
args.length = 3
args[0] = def
args[1] = 20.5
args[2] = 40
(args[1] + args[2]) = 20.540
Exception in thread "main" java.lang.NumberFormatException: For input string: "20.5"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Ex0104MainArg.main(Ex0104MainArg.java:15)

G:\マイドライブ\java1\EX01>
*/