package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();
    
    public void addVertex(T s){
        map.putIfAbsent(s, new ArrayList<>());
    }

    public void addEdge(T s, T d){
        addVertex(s);
        addVertex(d);
        map.get(s).add(d);
        map.get(d).add(s); 
    }

    public void bfs(){
        Queue<T> q = new LinkedList<>();
        Set<T> vis = new HashSet<>();

        T start = map.keySet().iterator().next(); // first vertex

        q.offer(start);
        vis.add(start);

        while (!q.isEmpty()) {
            T u = q.poll();
            System.out.print(u + " ");

            for (T v : map.get(u)) {
                if (!vis.contains(v)) {
                    vis.add(v);
                    q.offer(v);
                }
            }
        }

        System.out.println();
    }

    private void dfsUtil(T s, Set<T> vis) {
        System.out.print(s + " ");
        vis.add(s);
        for (T v : map.get(s)) {
            if (!vis.contains(v)) {
                dfsUtil(v, vis);
            }
        }
    }
                                     
    void dfs(T s){
        Set<T> vis = new HashSet<>();
        dfsUtil(s, vis);
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        System.out.print("BFS Traversal: ");
        graph.bfs(); 
        System.out.print("DFS Traversal: ");
        graph.dfs("A"); // Output: A B D E C
    }
    
}
