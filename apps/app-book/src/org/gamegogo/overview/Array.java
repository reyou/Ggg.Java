package org.gamegogo.overview;

// Demonstrate a one-dimensional array.
class Array {
    public static void main(String args[]) {
        ArrayFun();
        AlternativeArrayDeclarationSyntaxFun();
    }

    // Here, the square brackets follow the type specifier, and not the
    // name of the array variable.
    // For example, the following two declarations are equivalent:
    private static void AlternativeArrayDeclarationSyntaxFun() {
        System.out.println("AlternativeArrayDeclarationSyntaxFun");
        System.out.println("the following two declarations are equivalent");
        int al[] = new int[3];
        int[] a2 = new int[3];
        System.out.println("int al[] = new int[3];");
        System.out.println("int[] a2 = new int[3];");
        System.out.println("\nThe following declarations are also equivalent:");
        char twod1[][] = new char[3][4];
        System.out.println("char twod1[][] = new char[3][4];");
        char[][] twod2 = new char[3][4];
        System.out.println("char[][] twod2 = new char[3][4];");

        System.out.println("\n");
    }

    private static void ArrayFun() {
        System.out.println("ArrayFun");
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");
        System.out.println("\n");
    }
}
