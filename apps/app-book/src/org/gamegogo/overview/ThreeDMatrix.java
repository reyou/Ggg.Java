package org.gamegogo.overview;

/*Let’s look at one more example that uses a multidimensional array.
The following program creates a 3 by 4 by 5, three-dimensional array.
It then loads each element with the product of its indexes. Finally,
it displays these products.*/
// Demonstrate a three-dimensional array.
class ThreeDMatrix {
    public static void main(String args[]) {
        System.out.println("ThreeDMatrixFun");
        int threeD[][][] = new int[3][4][5];
        int i, j, k;
        // assign values
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        // print values
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}

