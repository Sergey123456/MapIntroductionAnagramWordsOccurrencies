package telran.words.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.words.Anagram;

class AnagramTest {
String word="eleectricity";
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testAnagram() {
		assertTrue(Anagram.isAnagramLetters(word,"tic"));
		assertTrue(Anagram.isAnagramLetters(word,"lecter"));
		assertTrue(Anagram.isAnagramLetters(word,"city"));
		assertTrue(Anagram.isAnagramLetters(word,"tric"));
	}
	@Test
	public void testNotAnagram() {
		assertFalse(Anagram.isAnagramLetters(word,"cell"));
		assertFalse(Anagram.isAnagramLetters(word,"yello"));
		assertFalse(Anagram.isAnagramLetters(word,"vector"));
		assertFalse(Anagram.isAnagramLetters(word,""));
		
	}
	

}
