package first;

import java.util.*;

public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if (S == T) return 0;

        // contruct the routes graph
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                map.putIfAbsent(routes[i][j], new ArrayList<>());
                map.get(routes[i][j]).add(i);
            }
        }

        // BFS
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>(); // visited route
        queue.offer(S);
        int bus = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            bus++;
            while (size-- > 0) {
                int station = queue.poll();
                List<Integer> routesInStation = map.get(station);
                for (Integer route : routesInStation) { // for each route of current station
                    if (!visited.add(route)) continue;
                    for (int i = 0; i < routes[route].length; i++) { // each station of next route
                        if (routes[route][i] == T) return bus;
                        queue.offer(routes[route][i]);
                    }
                }
            }
        }
        return -1;
    }
}
