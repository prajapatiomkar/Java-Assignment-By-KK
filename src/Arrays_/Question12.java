//1732. Find the Highest Altitude
package Arrays_;

public class Question12 {
    public static void main(String[] args) {
        int[] gain = {52,-91,72};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
           int currentAlt = 0;
           int maxAlt = 0;

           for (int i=0;i<gain.length;i++){
               currentAlt = currentAlt + gain[i];
               if (currentAlt>maxAlt){
                   maxAlt = currentAlt;
               }
           }return maxAlt;
    }
}
