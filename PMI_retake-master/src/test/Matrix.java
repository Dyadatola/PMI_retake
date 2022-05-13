public class Matrix {   
    public static void main(String[] atgs)
    {
        int[][] matrix = {
            {84,67,22,-72,95},
            {72,-70,2,-88,30},
            {95,-79,-87,-27,-97},
            {-52,-64,-13,-19,-27},
            {79,89,95,-84,-53}};

        Get_Minimum(matrix);
        
        Numbers_Divisible_By_Three(matrix);
    }
    static void Get_Minimum(int[][] matrix) {
        //number that will represent the lowest number
        int num = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<num){
                    num = matrix[i][j];
                }
            }
        }
        System.out.println("the minimum number is: "+num);
    }
    static void Numbers_Divisible_By_Three(int[][] matrix) {
        int[] numbers_divisable_by_tree = new int[25];
        int n = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++)
            {
                if (matrix[i][j]%3==0) {
                    numbers_divisable_by_tree[n] = matrix[i][j];
                    n+=1;
                }
            }
        }
        System.out.println("the list of all numbers devisable by 3:");
        for (int i=0; i<n; i++){
            System.out.println("    "+(i+1)+") "+numbers_divisable_by_tree[i]);
        }
    }
}
