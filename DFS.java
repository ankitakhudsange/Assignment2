/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import java.util.ArrayList;
import java.util.List;

public class DFS {
    // Function to add an edge to the adjacency list
    static void addEdge(List<List<Integer> > adj,int s, int t){
        // Add edge from vertex s to t
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    static void DFSRec(List<List<Integer> > adj,boolean[] visited, int s){
        visited[s] = true;
        System.out.print(s + " ");
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
            }
        }
    }

    // Main DFS function that initializes the visited array
    static void DFS(List<List<Integer> > adj, int s) {
        boolean[] visited = new boolean[adj.size()];
        DFSRec(adj, visited, s);
    }

    public static void main(String[] args)
    {
        int V = 5; 
        // Create an adjacency list for the graph
        List<List<Integer> > adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        int[][] edges = {
            { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 }
        };
        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }
        int source = 1; 
        System.out.println("DFS from source: " + source + " ");
        DFS(adj, source); 
    }
    
}
