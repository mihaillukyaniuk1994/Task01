/** 
 *  Класс Converter преобразут значение белорусских рублей в доллары
 */
public class Converter {
	
	final private double $COURSE = 2.14;
	
	public double count (double byn) {
		double dollar = byn / $COURSE;
		return dollar;
	}
}
