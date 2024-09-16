package Example_알고리즘;

import java.util.*;


//깊이 우선 탐색 (DFS)
//DFS는 그래프에서 한 경로를 끝까지 탐색한 후 다른 경로로 이동하는 방식입니다.
public class DFSExample {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6, 7));

        dfs(1, graph, new HashSet<>());
    }

    public static void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        visited.add(node);
        System.out.println("방문: " + node);

        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}
