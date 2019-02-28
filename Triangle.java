/** 
 *  Класс Treangle проверяет является ли выбранная фигура треугольником
 */
public class Triangle {
	
		public boolean check (int a, int b, int c) {
			boolean result = true;
			if(a >= (b + c) || b >= (a + c) || c >= (a + b)) {
				result = false;
			}
			return result;
		}
}