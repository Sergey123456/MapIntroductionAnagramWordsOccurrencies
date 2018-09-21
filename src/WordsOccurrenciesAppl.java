import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class WordsOccurrenciesAppl {

	public static void main(String[] args) {
		String text="abc. ab? lmn ab lmn! abc, lmn, zxc, gfh gf zxa zxa";
		displayWordOccurrencies(text);
	}

	private static void displayWordOccurrencies(String text) {
		String[] textArray = text.split("[\\W]+");
		TreeMap<TreeKey, Integer> treeMap = new TreeMap<>(new Comparator<TreeKey>() {
			@Override
			public int compare(TreeKey o1, TreeKey o2) {
				if (o1.word.equals(o2.word)) {
					return 0;
				} else if (o1.number > o2.number) {
					return -1;
				} else if(o1.number < o2.number) {
					return +1;
				}
				return o1.word.compareTo(o2.word);
			}
		});
		
		TreeKey exampleKey;
		Integer value;
		for (String string : textArray) {
			exampleKey 	= new TreeKey(1, string);
			value 		= null;
//			for (Entry<TreeKey, Integer> entry : treeMap.entrySet()) {
//				if (entry.getKey().equals(exampleKey)) {
//					value = treeMap.remove(entry.getKey());
//					value++;
//					treeMap.put(new TreeKey(value, string), value);
//					break;
//				}
//			}
			if (treeMap.containsKey(exampleKey)) {
				value = treeMap.remove(exampleKey);
				value++;
				treeMap.put(new TreeKey(value, string), value);
			}
			if (Objects.isNull(value)) {
				treeMap.put(exampleKey, 1);
			}
		}
		
		treeMap.forEach((k, v) -> System.out.println(k.toString() + " -> " + v));
		System.out.println(treeMap.size());
	}
}
