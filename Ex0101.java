/*
 * ��{�f�[�^�^�ƒlint, double, char
 * FileName : Ex0101.java
 * Author   : 20JZ0130 CHIN RYOU
 * Date     : 2021/04/14
 */
public class Ex0101 {
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int i;

		System.out.println("int�^�̃f�[�^");
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
		System.out.println("double�^�̃f�[�^");
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

		System.out.println("char�^�̃f�[�^");
		c = 'A';
		System.out.println("\t 'A' = " + c);
		c = 65;
		System.out.println("\t 65 = " + c);
		c = '\u0041';
		System.out.println("\t \u0041 = " + c);
	}

}
/*
G:\�}�C�h���C�u\java1>java Ex0101
int�^�̃f�[�^
         365 = 365
         0365 = 245
         0xaf = 175
         1_234 = 1234
double�^�̃f�[�^
         123.456 = 123.456
         789e-4 = 0.0789
         10 / 3.0 = 3.3333333333333335
         10 / 3 = 3.0
char�^�̃f�[�^
         'A' = A
         65 = A
         A = A

G:\�}�C�h���C�u\java1>
*/

/*
G:\�}�C�h���C�u\java1>javac Ex0101.java
Ex0101.java:14: �G���[: �ϐ�i�͏���������Ă��Ȃ��\��������܂�
                System.out.println("\t 365 = " + i);
                                                 ^
�G���[1��
*/