import java.util.*;

public class wellManFord2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph2(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
        // on the basis of this graph we can make changes in bellmanFord function to get
        // our desired output
    }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // algo TC=O(V+E)
        for (int i = 0; i < V - 1; i++) {
            // edges -O(E)
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                // u, v, wt
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                // relaxation
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) { // in java and c++ infinity + value =
                                                                              // negative
                    dist[v] = dist[u] + wt;
                }
            }

        }
        // print shortest distances
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge> edges = new ArrayList<>();
        createGraph2(edges);
        bellmanFord2(edges, 0, v);

    }
}