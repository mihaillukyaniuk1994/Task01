/**
 * Класс Distance ввыполняет преобразование заданной длинны из сантиметров
 * в метры и километры соответсвенно
 */
public class Distance {
	final private long KOEFF_METER = 100;
	final private long KOEFF_KILOMETER =  KOEFF_METER * 10;
	
	public long convertToMeter(long distance) {
		long meter = distance/KOEFF_METER;
		return meter;
	}
		
	public long convertToKilometer(long distance) {
		long kilometer = distance/(KOEFF_KILOMETER);
		return kilometer;
	}
	
}