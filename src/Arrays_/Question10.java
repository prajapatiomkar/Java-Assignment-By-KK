//1832. Check if the Sentence Is Pangram
package Arrays_;

public class Question10 {
    public static void main(String[] args) {
//        String sentence= "thequickbrownfoxjumpsoverthelazydog";
      String sentence= "leetcode";

        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for (int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']=true;
        }
        for (int i =0 ;i<26;i++){
            if (arr[i] == false){
                return false;
            }
        }return true;
    }
}
