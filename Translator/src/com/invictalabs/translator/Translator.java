package com.invictalabs.translator;

import java.util.HashMap;
import java.util.TreeSet;

public class Translator {

	HashMap<String, TreeSet<String>> map;

	public Translator() {
		map = new HashMap<>();
	}

	public void addPhrase(String word) {
		map.put(word.trim().toLowerCase(), new TreeSet<String>());
		map.get(word.trim().toLowerCase()).add(word.trim().toLowerCase());
	}

	public void addTranslation(String word, String translation) {
		if (this.find(word.trim().toLowerCase()) == false) {
			this.addPhrase(word.trim().toLowerCase());
		}
		map.get(word.trim().toLowerCase()).add(translation.trim().toLowerCase());
	}

	public boolean find(String word) {
		return map.containsKey(word.trim().toLowerCase());
	}

	public void show(String word) {
		System.out.println(map.get(word.trim().toLowerCase()));
	}

}
