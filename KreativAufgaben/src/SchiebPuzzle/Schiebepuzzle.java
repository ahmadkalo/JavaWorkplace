package SchiebPuzzle;

import java.util.*;


public class Schiebepuzzle {

    public static String solveShiftPuzzle(byte[][] zs, byte[][] zf) {
        if (!hasSolution(zs, zf)) return null;

        int n = zs.length; // assuming 3x3 puzzle
        String goalString = arrayToString(zf);
        String startString = arrayToString(zs);

        Set<String> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startString, findEmpty(zs), ""));

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        char[] dirChars = {'d', 'u', 'r', 'l'};

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.board.equals(goalString)) return node.path;
            visited.add(node.board);

            int emptyIndex = node.emptyIndex;
            int emptyRow = emptyIndex / n;
            int emptyCol = emptyIndex % n;

            for (int i = 0; i < 4; i++) {
                int newRow = emptyRow + directions[i][0];
                int newCol = emptyCol + directions[i][1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                    int newIndex = newRow * n + newCol;
                    String newBoard = swap(node.board, emptyIndex, newIndex);
                    if (!visited.contains(newBoard)) {
                        queue.add(new Node(newBoard, newIndex, node.path + dirChars[i]));
                    }
                }
            }
        }
        return null;
    }

    public static boolean hasSolution(byte[][] zs, byte[][] zf) {
        int inversionsZs = countInversions(zs);
        int inversionsZf = countInversions(zf);
        return (inversionsZs % 2) == (inversionsZf % 2);
    }

    private static int countInversions(byte[][] array) {
        int[] flatArray = flattenArray(array);
        int inversions = 0;
        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] == 0) continue;
            for (int j = i + 1; j < flatArray.length; j++) {
                if (flatArray[j] != 0 && flatArray[i] > flatArray[j]) inversions++;
            }
        }
        return inversions;
    }

    private static int[] flattenArray(byte[][] array) {
        int n = array.length;
        int[] flatArray = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[index++] = array[i][j];
            }
        }
        return flatArray;
    }

    private static String arrayToString(byte[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sb.append(array[i][j]);
            }
        }
        return sb.toString();
    }

    private static int findEmpty(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) return i * array.length + j;
            }
        }
        return -1;
    }

    private static String swap(String board, int i, int j) {
        char[] chars = board.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    static class Node {
        String board;
        int emptyIndex;
        String path;

        Node(String board, int emptyIndex, String path) {
            this.board = board;
            this.emptyIndex = emptyIndex;
            this.path = path;
        }
    }

    public static void main(String[] args) {
        byte[][] zs = {
            {3, 7, 6},
            {1, 4, 0},
            {8, 5, 2}
        };

        byte[][] zf = {
            {1, 2, 3},
            {8, 0, 4},
            {7, 6, 5}
        };

        System.out.println("Has Solution: " + hasSolution(zs, zf));
        System.out.println("Solution Path: " + solveShiftPuzzle(zs, zf));
    }
}

