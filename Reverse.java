/** 
 *  ����� Reverse ������� ������� �������� ����������
 */
public class Reverse {
	
	public void reverse(int varA, int varB) {
		int a = varA;
		int b = varB;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.printf("\n\n5) Var a = " + a + " Var b = " + b);
	}
	
}
