import java.util.Arrays;
public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int index = m - 1;
        int xIndex = n - 1;
        int yIndex = n - 1;
        while (xIndex >= 0 && yIndex >= 0) {
            if (X[xIndex] > Y[yIndex]) {
                X[index] = X[xIndex];
                xIndex--;
            } else {
                X[index] = Y[yIndex];
                yIndex--;
            }
            index--;
        }
         while (yIndex >= 0) {
            X[index] = Y[yIndex];
            yIndex--;
            index--;
        }
    }
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        mergeArrays(X,Y);
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
