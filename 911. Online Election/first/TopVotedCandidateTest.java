package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopVotedCandidateTest {

    @Test
    public void test01() {
        int[] persons = new int[]{0, 1, 1, 0, 0, 1, 0};
        int[] times = new int[]{0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate topVoted = new TopVotedCandidate(persons, times);
        Assertions.assertEquals(0, topVoted.q(3));
        Assertions.assertEquals(1, topVoted.q(12));
        Assertions.assertEquals(1, topVoted.q(25));
        Assertions.assertEquals(0, topVoted.q(15));
        Assertions.assertEquals(0, topVoted.q(24));
        Assertions.assertEquals(1, topVoted.q(8));
    }

    @Test
    public void test02() {
        int[] persons = new int[]{0, 0, 0, 0, 1};
        int[] times = new int[]{0, 6, 39, 52, 75};
        TopVotedCandidate topVoted = new TopVotedCandidate(persons, times);
        //Assertions.assertEquals(0, topVoted.q(3));
        //Assertions.assertEquals(0, topVoted.q(20));
        //Assertions.assertEquals(0, topVoted.q(45));
        //Assertions.assertEquals(0, topVoted.q(66));
        Assertions.assertEquals(0, topVoted.q(99));
        //Assertions.assertEquals(0, topVoted.q(8));
    }
}
