import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();

        String[] words = str.toLowerCase().split("\\W+");

        Map<String, Integer> wordCount = new HashMap<>();
        for(String w : words){
            wordCount.put(w, wordCount.getOrDefault(w,0)+1);
        }

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            if(entry.getValue() == n){
                System.out.println(entry.getKey());
            }
        }


    }
}