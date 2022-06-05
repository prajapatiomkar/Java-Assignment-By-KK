//1773. Count Items Matching a Rule
package Arrays_;

import java.util.ArrayList;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();

        List<String> item = new ArrayList<>();
        item.add("phone");
        item.add("blue");
        item.add("iphone");

        List<String> item1 = new ArrayList<>();
        item1.add("computer");
        item1.add("silver");
        item1.add("lenovo");

        List<String> item2 = new ArrayList<>();
        item2.add("phone");
        item2.add("gold");
        item2.add("iphone");

        items.add(item);
        items.add(item1);
        items.add(item2);
        String ruleKey = "name";
        String ruleValue = "iphone";
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = 0;
        int count = 0;
        switch (ruleKey) {
            case "type":
                key = 0;
                break;
            case "color":
                key = 1;
                break;
            case "name":
                key = 2;
                break;
        }
        for (List<String> eachItem : items) {
            if (eachItem.get(key) == ruleValue) {
                count++;
            }
        }
        return count;
    }
}
