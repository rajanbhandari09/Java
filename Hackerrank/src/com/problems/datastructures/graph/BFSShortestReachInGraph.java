package com.problems.datastructures.graph;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BFSShortestReachInGraph {
    public static class Graph {
        int[][] edges;
        int size;
        
        public Graph(int size) {
            this.size = size;
            edges = new int[size][size];
            
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    edges[i][j]=-1;
                }
            }
            
            
            
        }

        public void addEdge(int first, int second) {
            edges[first][second] =6;
            edges[second][first] =6;
        }
        
        public int[] shortestReach(int startId) { 
            int[] distancesFromStartId = new int[size];
            Arrays.fill(distancesFromStartId,-1);
            distancesFromStartId[startId] =0;
            
            List<Integer> visitedNodes = new ArrayList<>();
            
            
            Queue<Integer> connectedNodes = new LinkedList<>();
            
            connectedNodes.add(startId);
            visitedNodes.add(startId);
            while(!connectedNodes.isEmpty()){
                
                int currentNode = connectedNodes.remove();
                
                
                for(int i=0;i<size;i++){
                    if(edges[currentNode][i]==6 && !visitedNodes.contains(i)){
                        distancesFromStartId[i] = distancesFromStartId[currentNode] + 6;
                        connectedNodes.add(i);
                        visitedNodes.add(i);
                    }
                    //if(distancesFromStartId[i]>= 0 || edges[currentNode][i]==-1 )
                      //  continue;
                    //distancesFromStartId[i] = distancesFromStartId[currentNode] + 6;
                    //connectedNodes.add(i);
                    
                    
                  
                    
                    
                                     
                }
                
               
            }
            
    return distancesFromStartId;
            
            
            
            
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}

