/*
 * ��{�f�[�^�^�ƒlboolean, byte, String
 * FileName : Ex0101b.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
 public class Ex0101b{
 	public static void main(String[] args){
 	// --------boolean
	boolean a;
	
	System.out.println("boolean�^�̃f�[�^");
	a = true;
	System.out.println("\t true = " + a);
	a = false;
	System.out.println("\t false = " + a);
	
	// -------byte
	byte b;
	
	System.out.println("byte�^�̃f�[�^");
	b = 127;
	System.out.println("\t 127 = " + b);
	b = -128;
	System.out.println("\t -128 = " + b);
	b = 128;
	System.out.println("\t 128 = " + b);
	
	//---------String
	String s;
	
	System.out.println("String�^�̃f�[�^");
	s = "abc";
	System.out.println("\t\"abc\"        =" + s);
	
	int len = s.length();
	System.out.println("\t s.length() = " + len);
	}
	 
 
 
 }
 /*
 G:\�}�C�h���C�u\java1\EX01>javac Ex0101b.java

G:\�}�C�h���C�u\java1\EX01>java Ex0101b
boolean�^�̃f�[�^
         true = true
         false = false
byte�^�̃f�[�^
         127 = 127
         -128 = -128
String�^�̃f�[�^
        "abc"        =abc
         s.length() = 3

G:\�}�C�h���C�u\java1\EX01>
*/
/*
G:\�}�C�h���C�u\java1\EX01>javac Ex0101b.java
Ex0101b.java:26: �G���[: �s�K���Ȍ^: ���x��������\��������int����byte�ւ̕ϊ�
        b = 128;
            ^
�G���[1��
*/