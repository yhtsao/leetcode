package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionLabels {
    public List<Integer> partitionLabelsV1(String S) {
        Set<Character> set = new HashSet<>();
        int[] leftDiff = new int[S.length()]; // different chars in left part
        int totalDiff = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.add(S.charAt(i))) leftDiff[i] = set.size();
            else leftDiff[i] = leftDiff[i - 1];
        }
        totalDiff = set.size();

        int[] rightDiff = new int[S.length()];
        set = new HashSet<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (set.add(S.charAt(i))) rightDiff[i] = set.size();
            else rightDiff[i] = rightDiff[i + 1];
        }

        List<Integer> ret = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            cnt++;
            if (leftDiff[i] + rightDiff[i + 1] == totalDiff) {
                ret.add(cnt);
                cnt = 0;
            }
        }
        ret.add(cnt + 1);
        return ret;
    }

    public List<Integer> partitionLabelsV2(String S) {
        int[] position = new int[26]; // last ocurred position
        for (int i = 0; i < S.length(); i++)
            position[S.charAt(i) - 'a'] = i;

        List<Integer> ret = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, position[S.charAt(i) - 'a']);
            if (end == i) { // this is the last time of current char
                ret.add(end - start + 1);
                start = i + 1;
            }
        }
        return ret;
    }
}
