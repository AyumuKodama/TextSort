import java.util.*;

public class SelectionSorter {
	public static void selectionSort(ArrayList<String> wordList) {
		for (int i = 0; i < wordList.size() - 1; i++) {
			for (int j = i + 1; j < wordList.size(); j++) {
				if (wordList.get(i).compareToIgnoreCase(wordList.get(j)) == 1) {
					Collections.swap(wordList, i, j);
				}
			}
		}
	}
}