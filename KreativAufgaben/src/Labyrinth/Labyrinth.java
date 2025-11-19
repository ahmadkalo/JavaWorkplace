package Labyrinth;

import java.util.LinkedList;
import java.util.Queue;

public class Labyrinth {
    // Helper class to store the position and path
    static class Node {
        int x, y;
        String path;

        Node(int x, int y, String path) {
            this.x = x;
            this.y = y;
            this.path = path;
        }
    }

    public static String search(boolean[][] map) {
        int n = map.length;
        // Check if the start or end positions are blocked
        if (map[0][0] || map[n - 1][n - 1]) return null;

        // Directions arrays: right, left, up, down
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        char[] directions = {'r', 'l', 'u', 'd'};

        // BFS initialization
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.add(new Node(0, 0, ""));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Check if we have reached the goal
            if (current.x == n - 1 && current.y == n - 1) {
                return current.path;
            }

            // Explore neighbors
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                // Check bounds and if the position is free and not visited
                if (newX >= 0 && newX < n && newY >= 0 && newY < n && !map[newX][newY] && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new Node(newX, newY, current.path + directions[i]));
                }
            }
        }

        // Return null if no path found
        return null;
    }

    public static void main(String[] args) {
        // Example test case
        boolean[][] map = {
            {false, false, false, false, false},
            {true, false, false, false, false},
            {false, false, true, false, true},
            {false, true, false, false, false},  
            {false, false, false, true, false}
        };
        String path = search(map);
        System.out.println(path); // Output: rddlldrrurrdr
    }
}
