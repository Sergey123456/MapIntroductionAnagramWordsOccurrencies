import java.util.*;
public class MapIntroductionAppl_YG_edition {

	public static void main(String[] args) {
		Map<String,Integer> months=new TreeMap<>();
		months.put("Jan", 1);
		months.put("Feb", 2);
		months.put("Mar", 3);
		months.put("Apr", 4);
		months.put("May", 5);
		months.put("Jun", 6);
		months.put("Jul", 7);
		Map<Integer,String> monthsIntStr=getMonthsIntegerString
				(months);
		displayMonthsIntegerString(monthsIntStr);
	}
	static Map<Integer,String> getMonthsIntegerString
	(Map<String,Integer> monthsStringInteger){
		// from month_name -> month_number
		//create month_number -> month_name
		TreeMap<Integer,String> res=new TreeMap<>();
//		for(Map.Entry<String, Integer>monthEntry:
//			monthsStringInteger.entrySet()) {
//			res.put(monthEntry.getValue(),monthEntry.getKey());
//		}
		monthsStringInteger.forEach((k,v)->res.put(v, k));
		return res;
	}
	static void displayMonthsIntegerString
	(Map<Integer,String> months) {
		//TODO printing as follows
		//1 -> Jan
		//2 -> Feb
		//.......
		//According to the calendar order
		months.forEach((k,v)->System.out.printf("%d -> %s\n",k,v));
	}

}
