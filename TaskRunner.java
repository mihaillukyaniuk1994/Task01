public class TaskRunner {
	public static void main(String args[]) {

		/**
		 * ����� 1) ��������� �������� �� ��������� ������ �������������
		 */

		Triangle Firstcheck = new Triangle();
		System.out.printf("1) Is the figure is treangle? : "
						  + Firstcheck.check(2, 1, 2) + "\n");

		/**
		 * ����� 2) ���������� ��� ��������� � ������ �������� ���������
		 */

		Dinasaure Dinasaure = new Dinasaure();
		Dinasaure.weight_gram = 2_100_000_000;
		Dinasaure.change();

		/**
		 * ����� 3) ���������� ������ ����� � ������ �������� ���������
		 */
		long byte_size = 7_696_581_394_432L;
		Size Converter = new Size();
		long kiloNum = Converter.convertToKiloByte(byte_size);
		long megaNum = Converter.convertToMegaByte(byte_size);
		long gigaNum = Converter.convertToGigaByte(byte_size);
		long teraNum = Converter.convertToTeraByte(byte_size);
		System.out.printf("\n3) We have size in Bytes " + byte_size + "\n" 
						          + " in Kilobytes it is: " + kiloNum + "\n"
						          + " in Megabytes it is: " + megaNum + "\n"
						          + " in Gigabytes it is: " + gigaNum + "\n"
						          + " in Terabytes it is: " + teraNum);

		/**
		 * ����� 4) ���������� ���������� � ������ �������� ���������
		 */
		long distance = 3255000;
		Distance Faraway = new Distance();
		System.out.printf("\n\n4) We have distance in santimeters " + distance
						          + "\nThis distance in meters: " 
						          + Faraway.convertToMeter(distance) 
						          + "\nThis distance in kilometers: " 
						          + Faraway.convertToKilometer(distance));

		/**
		 * ����� 5) ������ ������� �������� ���� ����������
		 */
		int varA = 234, varB = 21;
		Reverse Change = new Reverse();
		Change.reverse(varA, varB);

		/**
		 * ����� 6) ��������� �������� ������ �� ���������, � ����� �� ��� ������
		 */
		Candy Sweet = new Candy();
		Sweet.priceCompare();

		/**
		 * ����� 7) ��������� ������� �������� �� ����� ��������� ���� �� N-� ����� 
		 * ����������� ������
		 */
		Converter Conver = new Converter();
		System.out.printf( "\n\n7) We can have " + Conver.count(1300) + " dollars");
	}
}