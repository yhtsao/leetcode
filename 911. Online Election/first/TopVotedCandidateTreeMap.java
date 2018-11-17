package first;

import java.util.Map;
import java.util.TreeMap;

public class TopVotedCandidateTreeMap {

    TreeMap<Integer, Integer> map = new TreeMap<>(); // time -> top candidate

    public TopVotedCandidateTreeMap(int[] persons, int[] times) {
        int maxVote = 0;
        int topCand = 0; // top candidate
        int[] votes = new int[persons.length];
        for (int i = 0; i < times.length; i++) {
            int candidate = persons[i];
            votes[candidate]++;
            if (votes[candidate] >= maxVote) {
                // update the top candidate on current time
                maxVote = votes[candidate];
                topCand = candidate;
            }
            map.put(times[i], topCand);
        }

    }

    public int q(int t) {
        Map.Entry<Integer, Integer> entry = map.floorEntry(t);
        return entry.getValue();
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
