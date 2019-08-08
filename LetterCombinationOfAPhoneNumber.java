import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<String>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            ArrayList<String> helper = new ArrayList<>();
            String digitToChar = map.get(digits.charAt(i));

            for (int j = 0; j < result.size(); j++) {
                for (int k = 0; k < digitToChar.length(); k++) {
                    StringBuilder getExisting = new StringBuilder(result.get(j));
                    String newString = getExisting.append(digitToChar.charAt(k)).toString();
                    helper.add(newString);
                }
            }
            result.clear();
            result.addAll(helper);
        }

        return result;
    }
}