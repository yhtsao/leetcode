package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        String[] ret = new String[logs.length];
        TreeMap<String, String> letterLogs = new TreeMap<>();
        List<String> digitLog = new ArrayList<>();
        for (String log : logs) {
            int i = 0;
            while (log.charAt(i) != ' ') i++;
            i++;
            if (Character.isDigit(log.charAt(i))) {
                digitLog.add(log);
            } else {
                String key = log.substring(i, log.length());
                letterLogs.put(key, log);
            }
        }

        int p = 0;
        for (Map.Entry<String, String> entry : letterLogs.entrySet()) {
            ret[p++] = entry.getValue();
        }
        for (String log : digitLog)
            ret[p++] = log;
        return ret;
    }
}
