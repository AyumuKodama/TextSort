import java.io.*;
import java.util.*;

public class SelectionSortTester {

	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>();
		
        String fileName = "./src/verses.txt";

        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                String[] split = line.trim().split("\\s+");
                for (String word : split) {
                	if (!word.equals("")) {
                		wordList.add(word);
                	}
                }
            }   

            bufferedReader.close();
            
            final long startTime = System.nanoTime();
            SelectionSorter.selectionSort(wordList);
            final long duration = System.nanoTime() - startTime;
            double secs = duration / 1e+9;
            for (String word : wordList) {
            	System.out.println(word);
            }
            
            System.out.println(wordList.size() + " words");
            System.out.println(secs + " seconds to sort");
            
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
    }
}