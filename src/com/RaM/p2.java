package com.RaM;

import java.util.ArrayList;

public class p2 {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,3));

        graph[1].add(new Edge(1,0,5));

        graph[1].add(new Edge(1,2,1));

        graph[1].add(new Edge(1,3,3));


        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];

        createGraph(graph);

        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);

            System.out.println(e.dest);;
        }

    }

}
