/*
 * �萔�̃f�t�H���g�̌^
 * FileName : Ex0102b.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0102b{
 	public static void main(String[] args){
		int       a = 123;
		final int F = 123;
		
		
		System.out.println("a = " + a);
		System.out.println("F = " + F);
		a = 456;
		System.out.println("a = " + a);
		
		F = 456;
		System.out.println("F = " + F);
 	}
 }
 /*
 G:\�}�C�h���C�u\java1\EX01>javac Ex0102b.java

G:\�}�C�h���C�u\java1\EX01>java Ex0102b
a = 123
F = 123
a = 456

G:\�}�C�h���C�u\java1\EX01>
*/
/*
G:\�}�C�h���C�u\java1\EX01>javac Ex0102b.java
Ex0102b.java:18: �G���[: final�ϐ�F�ɒl�������邱�Ƃ͂ł��܂���
                F = 456;
                ^
�G���[1��

G:\�}�C�h���C�u\java1\EX01>