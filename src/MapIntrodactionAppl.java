import java.util.Map;
import java.util.TreeMap;

public class MapIntrodactionAppl {

	public static void main(String[] args) {
//		Map<String, Integer> months = new LinkedHashMap<>();
		Map<String, Integer> months = new TreeMap<>();
//		Map<String, Integer> months = new HashMap<>();
		months.put("Jan", 1);
		months.put("Feb", 2);
		months.put("Mar", 3);
		months.put("Apr", 4);
		months.put("May", 5);
		months.put("Jun", 6);
		months.put("Jul", 7);
		
//		System.out.println("iterating entries");
//		for(Map.Entry<String, Integer> entryMonth : months.entrySet()) {
//			System.out.printf("%s -> %d\n", entryMonth.getKey(), entryMonth.getValue());
//		}
		
		Map<Integer, String> monthsIntStr = getMonthsIntegerString(months);
		displayMonthsIntegerString(monthsIntStr);
	}
	
	static Map<Integer, String> getMonthsIntegerString(Map<String, Integer> monthsStringInteger) {
		//TODO from month_name > month_number create month_number -> month name
		// Принимает любой мар, меняет ключ со значением местами
		Map<Integer, String> newMonths = new TreeMap<>();
//		for(Map.Entry<String, Integer> entryMonth : monthsStringInteger.entrySet()) {
//			newMonths.put(entryMonth.getValue(), entryMonth.getKey());
//		}
		monthsStringInteger.forEach((k, v) -> newMonths.put(v, k));
		return newMonths;
	}
	
	static void displayMonthsIntegerString(Map<Integer, String> months) {
//		for(Map.Entry<Integer, String> entryMonth : months.entrySet()) {
//			System.out.println(entryMonth.getKey() + " -> " + entryMonth.getValue());
//		}
		months.forEach((k, v) -> System.out.printf("%d -> %s\n", k, v));
		//TODO printing as follows
		// 1 -> jan
		// 2 -> feb
		//.......
		// according to the calendar order
	}
}
