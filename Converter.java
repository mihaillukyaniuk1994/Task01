/** 
 *  ����� Converter ���������� �������� ����������� ������ � �������
 */
public class Converter {
	
	final private double $COURSE = 2.14;
	
	public double count (double byn) {
		double dollar = byn / $COURSE;
		return dollar;
	}
}
