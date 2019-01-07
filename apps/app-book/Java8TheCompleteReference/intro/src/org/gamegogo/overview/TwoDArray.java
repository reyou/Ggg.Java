package org.gamegogo.overview;

// Demonstrate a two-dimensional array.
class TwoDArray {
    public static void main(String args[]) {
        TwoDArrayFun();
        AllocateFun();
    }

    private static void TwoDArrayFun() {
        System.out.println("TwoDArrayFun");
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        // assign values
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        // print
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    /*While there is no advantage to individually allocating the second dimension
    arrays in this situation, there may be in others. For example, when you
    allocate dimensions manually, you do not need to allocate the same number
    of elements for each dimension. As stated earlier, since multidimensional
    arrays are actually arrays of arrays, the length of each array is under your
    control.*/
    // See TwoDAgain
    public static void AllocateFun() {
        System.out.println("AllocateFun");
        int twoD[][] = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];
        System.out.println("twoD.length: " + twoD.length);
        System.out.println("twoD[0].length: " + twoD[0].length);
        System.out.println("\n");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[0].length; j++) {
                System.out.println("twoD[" + i + "][" + j + "]: " + twoD[i][j]);
            }
        }
        System.out.println("\n");
    }

}

