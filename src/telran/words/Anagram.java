package telran.words;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {
//	ArrayVersion { *************************************************************
//	private static final int SIZE_ARRAY = 200;
//	ArrayVersion } *************************************************************
	public static boolean isAnagramLetters(String word, String anagram) {
		if ("".equals(anagram)) {
			return false;
		}
		Objects.requireNonNull(word);
		Objects.requireNonNull(anagram);
		word.toLowerCase();
		anagram.toLowerCase();
		
//		StringBuilderVersion { *************************************************
		StringBuilder strBld_word = new StringBuilder(word);
		int index = -1;
		for (int i = 0; i < anagram.length(); i++) {
			index = strBld_word.indexOf(anagram.substring(i, i + 1));
			if (index == -1) {
				return false;
			} else {
				strBld_word.deleteCharAt(index);
			}
		}
		return true;
//		StringBuilderVersion } *************************************************
	}
		
//		ArrayVersion { *********************************************************
//		int[] ar = new int[SIZE_ARRAY];
//		char curCharacter;
//		for (int i = 0; i < word.length(); i++) {
//			curCharacter = word.charAt(i);
//			ar[curCharacter]++;
//		}
//		
//		for (int i = 0; i < anagram.length(); i++) {
//			curCharacter = anagram.charAt(i);
//			if (validateArrayIndex(curCharacter) && ar[curCharacter] > 0) {
//				ar[curCharacter]--;
//			} else {
//				return false;
//			}
//		}
//		return true;
		
//		private static boolean validateArrayIndex(char curCharacter) {
//			return curCharacter >= 0 && curCharacter < SIZE_ARRAY ? true : false;
//		}
//		ArrayVersion } *********************************************************
	
// 		HashMapVersion { *******************************************************
//		HashMap<Character, Integer> characters = new HashMap<>();
//		Character curCharacter;
//		for (int i = 0; i < word.length(); i++) {
//			curCharacter = word.charAt(i);
//			characters.put(curCharacter, characters.containsKey(curCharacter) ? characters.get(curCharacter) + 1 : 1);
//		}
//		
//		for (int i = 0; i < anagram.length(); i++) {
//			curCharacter = anagram.charAt(i);
//			if (characters.containsKey(curCharacter) && characters.get(curCharacter) > 0) {
//				characters.put(curCharacter, characters.get(curCharacter) - 1);
//			} else {
//				return false;
//			}
//		}
//		return true;
// 		HashMapVersion } *******************************************************
		
		// HashMapVersionUseMergeFunction { ************************************
//		Map<Character, Integer> characters = new HashMap<>();
//		Character curCharacter;
//		for (int i = 0; i < word.length(); i++) {
//			curCharacter = word.charAt(i);
//			characters.merge(curCharacter, 1, (v1, v2) -> ++v1);
//		}
//		
//		for (int i = 0; i < anagram.length(); i++) {
//			curCharacter = anagram.charAt(i);
//			characters.merge(curCharacter, -1, (v1, v2) -> --v1);
//		}
//		
//		Collection<Integer> values = characters.values();
//		for (Integer value : values) {
//			if (value < 0) {
//				return false;
//			}
//		}
//		return true;
// 		HashMapVersionUseMergeFunction } ***************************************

// 		HashMapVersionUseComputeFunction { *************************************
//		Map<Character, Integer> characters = new HashMap<>();
//		Character curCharacter;
//		for (int i = 0; i < word.length(); i++) {
//			curCharacter = word.charAt(i);
//			characters.compute(curCharacter, (k, v) -> (v == null) ? 1 : ++v);
//		}
//		
//		for (int i = 0; i < anagram.length(); i++) {
//			curCharacter = anagram.charAt(i);
//			characters.compute(curCharacter, (k, v) -> (v == null) ? -1 : --v);
//		}
//		
//		Collection<Integer> values = characters.values();
//		for (Integer value : values) {
//			if (value < 0) {
//				return false;
//			}
//		}
//		return true;
// 		HashMapVersionUseComputeFunction } *************************************
	}
