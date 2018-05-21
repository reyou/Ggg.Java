package org.gamegogo.overview;

// Manually allocate differing size second dimensions.
//  For example, the following program creates a two-dimensional array
// in which the sizes of the second dimension are unequal:
class TwoDAgain {
    public static void main(String args[]) {
        System.out.println("TwoDAgainFun");
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
        System.out.println("\n");
    }
}
