public class TaskRunner {
	public static void main(String args[]) {

		/**
		 * Пункт 1) Проверяем является ли выбранная фигура треугольником
		 */

		Triangle Firstcheck = new Triangle();
		System.out.printf("1) Is the figure is treangle? : "
						  + Firstcheck.check(2, 1, 2) + "\n");

		/**
		 * Пункт 2) Отображаем вес динозавра в разных единицах измерения
		 */

		Dinasaure Dinasaure = new Dinasaure();
		Dinasaure.weight_gram = 2_100_000_000;
		Dinasaure.change();

		/**
		 * Пункт 3) Отображаем размер файла в разных единицах измерения
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
		 * Пункт 4) Отображаем расстояние в разных единицах измерения
		 */
		long distance = 3255000;
		Distance Faraway = new Distance();
		System.out.printf("\n\n4) We have distance in santimeters " + distance
						          + "\nThis distance in meters: " 
						          + Faraway.convertToMeter(distance) 
						          + "\nThis distance in kilometers: " 
						          + Faraway.convertToKilometer(distance));

		/**
		 * Пункт 5) Меняем местами значение двух переменных
		 */
		int varA = 234, varB = 21;
		Reverse Change = new Reverse();
		Change.reverse(varA, varB);

		/**
		 * Пункт 6) Вычисляем соимость конфет за килограмм, и какие из них дороже
		 */
		Candy Sweet = new Candy();
		Sweet.priceCompare();

		/**
		 * Пункт 7) Вычисляем сколько долларов мы можем позволить себе на N-ю сумму 
		 * белорусских рублей
		 */
		Converter Conver = new Converter();
		System.out.printf( "\n\n7) We can have " + Conver.count(1300) + " dollars");
	}
}