package com.IBM;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {
    static Map<Integer, Set<Integer>> graph;

    public static List<Integer> coolGraph(int gNodes, List<Integer> gFrom, List<Integer> gTo) {
        buildGraph(gNodes, gFrom, gTo);
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[gNodes + 1];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(gNodes);
        while (!pq.isEmpty()) {
            int node = pq.poll();
            if (!visited[node]) {
                result.add(node);
                visited[node] = true;

                for (int neighbor : graph.get(node)) {
                    if (!visited[neighbor]) {
                        pq.offer(neighbor);
                    }
                }
            }
        }

        return result;
    }

    private static void buildGraph(int gNodes, List<Integer> gFrom, List<Integer> gTo) {
        graph = new HashMap<>();
        for (int i = 1; i <= gNodes; i++) {
            graph.put(i, new HashSet<>());
        }

        for (int i = 0; i < gFrom.size(); i++) {
            graph.get(gFrom.get(i)).add(gTo.get(i));
            graph.get(gTo.get(i)).add(gFrom.get(i));
        }
    }
}

class CoolGraph {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+", "").split(" ");
        int gNodes = Integer.parseInt(gNodesEdges[0]);
        int gEdges = Integer.parseInt(gNodesEdges[1]);

        List<Integer> gFrom = new ArrayList<>();
        List<Integer> gTo = new ArrayList<>();

        IntStream.range(0, gEdges).forEach(i -> {
            try {
                String[] gFromTo = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                gFrom.add(Integer.parseInt(gFromTo[0]));
                gTo.add(Integer.parseInt(gFromTo[1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.coolGraph(gNodes, gFrom, gTo);

        // Updated printing logic for horizontal output
        String horizontalOutput = String.join(" ", result.stream()
                .map(Object::toString)
                .collect(Collectors.toList()));

        bufferedWriter.write(horizontalOutput);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
