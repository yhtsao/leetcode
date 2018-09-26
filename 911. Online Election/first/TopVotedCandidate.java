package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopVotedCandidate {
    private int[] times;
    private Map<Integer, Integer> timeToCandidateMap = new HashMap<>();

    public TopVotedCandidate(int[] persons, int[] times) {
        int prevTopCandidate = 0;
        int[] votes = new int[persons.length];
        for (int i = 0; i < persons.length; i++) {
            votes[persons[i]]++;
            if (votes[persons[i]] >= votes[prevTopCandidate]) {
                timeToCandidateMap.put(times[i], persons[i]);
                prevTopCandidate = persons[i];
            } else {
                timeToCandidateMap.put(times[i], prevTopCandidate);
            }
        }
        this.times = times;
    }

    public int q(int t) {
        // Find index of time by binary search
        // if t is in times, return the index
        // else, return (-insertPoint) - 1
        int insertPoint = Arrays.binarySearch(times, t);

        return insertPoint < 0 ? timeToCandidateMap.get(times[-insertPoint - 2]) : timeToCandidateMap.get(times[insertPoint]);
    }
}
