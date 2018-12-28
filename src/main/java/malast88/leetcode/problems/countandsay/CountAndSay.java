package malast88.leetcode.problems.countandsay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountAndSay {

    /**
     * Solution for https://leetcode.com/problems/count-and-say/
     * Generate n-th element of https://en.wikipedia.org/wiki/Look-and-say_sequence .
     * See also https://oeis.org/A005150
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        List<Integer> aCurr = new ArrayList<>();
        aCurr.add(1);
        for (int i = 2; i <= n; i++) {
            aCurr = countAndSayArray(aCurr);
        }
        return aCurr.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }

    private List<Integer> countAndSayArray(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        int aIndex = 0;
        while (aIndex < a.size()) {
            int aCurr = a.get(aIndex);
            int aCurrCount = countSameNumberSequenceLength(a, aIndex);
            aIndex += aCurrCount;
            result.add(aCurrCount);
            result.add(aCurr);
        }
        return result;
    }

    private int countSameNumberSequenceLength(List<Integer> a, int aIndex) {
        int aCurr = a.get(aIndex);
        int aCurrCount = 1;
        aIndex++;
        while (aIndex < a.size() && a.get(aIndex) == aCurr) {
            aCurrCount++;
            aIndex++;
        }
        return aCurrCount;
    }
}
