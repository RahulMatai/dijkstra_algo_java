/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dikstra_algorithm;

import dikstra_algorithm.algo.Graph;

/**
 *
 * @author varun
 */
public class Dikstra_algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vertices = 5;
            Graph graph = new Graph(vertices);
            graph.addEdge(0, 1, 4);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 2, 1);
            graph.addEdge(1, 3, 2);
            graph.addEdge(2, 3, 4);
            graph.addEdge(3, 4, 2);
      
            graph.dijkstra_GetMinDistances(0);
    }
}
