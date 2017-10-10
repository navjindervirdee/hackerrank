import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String,Integer>();
        noteMap = new HashMap<String,Integer>();
        String [] magWords = magazine.trim().split(" ");
        String [] noteWords = note.trim().split(" ");
        
        for(int i=0;i<magWords.length;i++){
            String word = magWords[i];
            if(magazineMap.containsKey(word)){
                magazineMap.put(word, magazineMap.get(word)+1);
            }
            else{
                magazineMap.put(word,new Integer(1));
            }
        }
        
        for(int i=0;i<noteWords.length;i++){
            String word = noteWords[i];
            if(noteMap.containsKey(word)){
                noteMap.put(word, noteMap.get(word)+1);
            }
            else{
                noteMap.put(word,new Integer(1));
            }
        }
    }
    
    public boolean solve() {
        for(String key : noteMap.keySet()){
            if(!magazineMap.containsKey(key)){
                return false;
            }
            int value1 = noteMap.get(key);
            int value2 = magazineMap.get(key);
            if(value1>value2){ 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
