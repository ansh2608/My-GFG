public class Main {
    int[][] dirs = new int[][]{{0,-1},{-1, 0},{0,1},{1,0},{-1,-1},{-1,1},{1,1},{1,-1}};

    public int numIslands(char[][] grid) {
        // Code here
        int noOfIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] != '0' && !visited[i][j]){
                    dfs(grid, visited, i, j);
                    noOfIslands++;
                }
            }
        }

        return noOfIslands;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j){
        if(grid[i][j] == '0'){
            return;
        }

        visited[i][j] = true;

        for(int[] dir : dirs){
            int r = i+dir[0];
            int c = j+dir[1];

            if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length &&
                    grid[r][c] == '1' && !visited[r][c]){
                dfs(grid, visited, r, c);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}