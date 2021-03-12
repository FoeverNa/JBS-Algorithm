package datastructure.graph;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex {
    public int value;
    List<Integer> adjList;

    public Vertex(int value, List<Integer> adjList) {
        this.value = value;
        this.adjList = adjList;
    }
}

class Graph {
    List<Vertex> vertexList = new ArrayList<>();
    boolean [] visited;
    Boolean isFind = false;



    public void insert(int value, int [] adjVertices) {
        int vInd = vertexList.size();
        List<Integer> adjList = new ArrayList<>();

        for (int idx: adjVertices) {
            adjList.add(idx);
        }
        Vertex v = new Vertex(value, adjList);

        for (int adjV: v.adjList) { // 입력한것을 쌍방으로 연결하기 위한 것 => 무향그래프
            vertexList.get(adjV).adjList.add(vInd);
        }

        vertexList.add(v);
    }

    public boolean bfs(int ind, int value) {
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[vertexList.size()];
        queue.add(ind);
        while (!queue.isEmpty()) {
            Integer vInd = queue.poll();
            Vertex vertex = vertexList.get(vInd);

            if (visited[vInd] ) {
                continue;
            }
            if (vertex.value == value) {
                return true;
            }
            visited[vInd] = true;
//            queue.addAll(vertex.adjList);
            for (int adjv: vertex.adjList) { // 조금더 최적화, visited 에 있으면 queue 에 추가하지 않음
                if(!visited[vInd]){
                    queue.add(adjv);
                }
            }
        }
        return false;
    }

    public boolean dfs(int ind, int value) {
        // 구현1, bfs를 복사해서 queue만 stack으로 바꾸면됨
        visited = new boolean[vertexList.size()];
        isFind = false;
        dfsHelper(ind, value);
        return isFind;
    }

    private void dfsHelper(int vInd, int value) {
        if (visited[vInd] || isFind){ // isFind도 추가해줫음
            return;
        }
        Vertex vertex = vertexList.get(vInd);
        if (vertex.value == value) {
            isFind = true;
            return;
        }
        visited[vInd] = true;
        for (int integer : vertex.adjList) {
            dfsHelper(integer, value);
        }
    }
}

class GraphTest {
    public static void main(String[] args) {
        Graph g = new Graph();

        int [] array1 = {};
        g.insert(0, array1);

        int [] array2 = {0};
        g.insert(1, array2);

        int [] array3 = {1};
        g.insert(2, array3);

        int [] array4 = {0, 2};
        g.insert(3, array4);

        int [] array5 = {3};
        g.insert(4, array5);

        System.out.println(g.bfs(0, 2));
        System.out.println(g.bfs(0, 6));
        System.out.println(g.dfs(0, 2));
        System.out.println(g.dfs(0, 6));
    }
}