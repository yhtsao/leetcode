package first;

import java.util.List;
import java.util.Stack;

public class FuncExclusiveTime {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] funcTime = new int[n];
        int preFuncTime = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (String log : logs) {
            String[] logDetail = log.split(":");
            int funcId = Integer.parseInt(logDetail[0]);
            String type = logDetail[1];
            int timestamp = Integer.parseInt(logDetail[2]);

            int funcOnStack = stack.peek();
            funcTime[funcOnStack] += (timestamp - preFuncTime);
            preFuncTime = timestamp;
            if (type.equals("start")) {
                stack.push(funcId);
            } else {
                funcTime[funcOnStack]++;
                preFuncTime++;
                stack.pop();
            }

        }
        return funcTime;
    }
}

