public class Multi_arr {
    public static void main(String[] args){
        int[][] num = {{1,3,4,4},{56,6,77,87}};
        //for loop
        for(int row = 0; row<num.length; row++){
            for(int col = 0; col<num[row].length; col++){
                System.out.println("num["+row+"]["+col+"] = "+num[row][col]);
            }
        }

        //for-each loop
        System.out.println("For each loop");
        for(int[] row : num){
            for(int col: row){
                System.out.println(col);
            }
        }
    }
}
