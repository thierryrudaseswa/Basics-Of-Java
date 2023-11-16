 class Hello {
    public static void main(Main[] args) {
        int treeHeight = 6; 
        for (int i = 1; i <= treeHeight; i++) {
           
            for (int j = 0; j < treeHeight - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < treeHeight - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
