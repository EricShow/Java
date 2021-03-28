package leetcode1230;

public class maxValue {
	//最大礼物总数
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(f(grid));
	}
	public static int f(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0&&j==0){
                    grid[i][j] = grid[i][j];
                }
                else if(i==0){
                    grid[i][j] = grid[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    grid[i][j] = grid[i-1][j]+grid[i][j];
                }
                else{
                    grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }
        return grid[row-1][col-1];
    }

}
