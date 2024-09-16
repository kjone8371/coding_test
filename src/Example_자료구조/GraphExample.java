package Example_자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//그래프
//그래프는 노드(정점)들과 그 노드를 연결하는 간선으로 이루어진 자료구조입니다.
public class GraphExample {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(5));

        System.out.println("노드 1과 연결된 노드들:" + graph.get(1));
    }
}
