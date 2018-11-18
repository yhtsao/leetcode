package first;

public class DeleteColumnMakeSorted {
    public int minDeletionSize(String[] A) {
        int D = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    D++;
                    break;
                }
            }
        }
        return D;
    }
}
