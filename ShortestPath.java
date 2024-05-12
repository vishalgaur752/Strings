public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }
        int X_sqare = x * x;
        int Y_sqaure = y * y;
        return (float) Math.sqrt(X_sqare + Y_sqaure);
    }

    public static void main(String[] args) {
        // Question : Given a route contaning 4 direction (E, W, N, S), find the
        // Shortest path to reach
        // N = y +1
        // S= y-1
        // W=x-1
        // E=x+1
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
