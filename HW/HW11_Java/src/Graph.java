import java.util.Stack;
public class Graph {

    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int originalC = image[sr][sc];
        if(originalC != color){
            dfs(image, sr, sc, originalC, color);
        }
        return image;
    }

    public int[][] dfs(int[][] image, int i, int j, int OC, int newColor){


//
////        if(i<0 || i >= image.length || j >= image.length || j < 0){
////            return;
////        }
//        if(i<0 || i>= image.length || j<0 || j>= image[0].length || image[i][j] != OC){
//            return;
//        }
//
//        image[i][j] = newColor;
//
//        // recursive, traverse
//        dfs(image, i+1, j, OC, newColor); // down
//        dfs(image, i-1, j, OC, newColor); // up
//        dfs(image, i, j+1, OC, newColor);//right
//        dfs(image, i, j-1, OC, newColor); // left

        if(OC == newColor){
            return image;
        }

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i,j});

        while(!stack.empty()){

            int[] currentPos = stack.pop();
            int r = currentPos[0];
            int c =  currentPos[1];

            if(r<0 || r >= image.length || c<0 || c >= image[0].length || image[r][c] != OC){
                continue;
            }

            image[r][c] = newColor;
            stack.push(new int[]{r-1,c}); //up
            stack.push(new int[]{r+1,c}); //down
            stack.push(new int[]{r,c-1}); //left
            stack.push(new int[]{r,c+1}); //right
        }

        return image;

    }


}
