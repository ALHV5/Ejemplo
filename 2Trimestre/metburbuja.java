public class metburbuja {
    public static void main(String[] args) {
        int num[] = { 26, 50, 7, 23, 80 };
        burbuja(num);
        for (int i = 0; i < num.length - 1; i++) {
            System.out.println(num[i] + ", ");
        }
    }

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
