/*
 * 基本データ型と値int, double, char
 * FileName : Ex0101.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
public class Ex0101 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;

		System.out.println("int型のデータ");
		//i = 365;
		System.out.println("\t 365 = " + i);
		i = 0365;
		System.out.println("\t 0365 = " + i);
		i = 0xaf;
		System.out.println("\t 0xaf = " + i);
		i = 1_234;
		System.out.println("\t 1_234 = " + i);

		// ----------double
		double d;
		System.out.println("double型のデータ");
		d = 123.456;
		System.out.println("\t 123.456 = " + d);
		d = 789e-4;
		System.out.println("\t 789e-4 = " + d);
		d = 10 / 3.0;
		System.out.println("\t 10 / 3.0 = " + d);
		d = 10 / 3;
		System.out.println("\t 10 / 3 = " + d);

		// ------------char
		char c;

		System.out.println("char型のデータ");
		c = 'A';
		System.out.println("\t 'A' = " + c);
		c = 65;
		System.out.println("\t 65 = " + c);
		c = '\u0041';
		System.out.println("\t \u0041 = " + c);
	}

}
/*
G:\マイドライブ\java1>java Ex0101
int型のデータ
         365 = 365
         0365 = 245
         0xaf = 175
         1_234 = 1234
double型のデータ
         123.456 = 123.456
         789e-4 = 0.0789
         10 / 3.0 = 3.3333333333333335
         10 / 3 = 3.0
char型のデータ
         'A' = A
         65 = A
         A = A

G:\マイドライブ\java1>
*/

/*
G:\マイドライブ\java1>javac Ex0101.java
Ex0101.java:14: エラー: 変数iは初期化されていない可能性があります
                System.out.println("\t 365 = " + i);
                                                 ^
エラー1個
*/