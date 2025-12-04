package series;

//Java Program to Find Transpose of Matrix

public class Day23_1 {
    static final  int M = 3;
    static final  int N = 4;

    static  void transpose(int A[][], int B[][]) {
        int i, j;
        for(i = 0; i < N; i++){
            for(j = 0; j < M; j++){
                B[i][j] = A[j][i];
            }
        }
    }
    public static void main(String[] args) {
        int A[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int B[][] = new int[N][M], i, j;

        transpose(A, B);

        System.out.print("Result matrix is \n");
        for(i = 0; i < N; i++) {
            for (j = 0; j < M; j++)
                System.out.print(B[i][j] + " ");
                System.out.print("\n");
        }
    }
}
