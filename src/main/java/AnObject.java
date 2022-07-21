public class AnObject {
    double [] anArray;
    int [][] aMatrix;
    int n;

    public AnObject(int n) {
        this.n = n;
        anArray = new double[n];
        aMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            anArray[i] = Math.random();
            for (int j = i+1; j < n; j++) {
                aMatrix[i][j] = (int) (Math.random() * 100);
                aMatrix[j][i] = aMatrix[i][j];

            }
        }
    }
}
