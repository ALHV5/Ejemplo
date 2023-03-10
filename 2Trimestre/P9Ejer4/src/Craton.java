import java.util.Random;

public class Craton {
    private int numCart[];

    public static void crearcarton(int njuga) {
        int carton[][] = new int[4][6];
        Random r = new Random();
        int ac = 1;
        int i,j,k;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 6; y++) {
                do{
                    carton[i][j] = r.nextInt(20)
                }while(k!=j);
            }
            System.out.println();
        }

    }

    public int anotaBola(int bola, boolean compLinea) {
        int i, j;
        i = (bola - 1) / 20;

    }

    public void setNumCart(int[] numCart) {
        this.numCart = numCart;
    }

    public static int buscarNum() {

    }

}