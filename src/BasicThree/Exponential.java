package basics.src.BasicThree;
import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {

        int  n, k, total=1;

        Scanner inp =new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();
        System.out.print("Üs olan sayıyı giriniz: ");
        k = inp.nextInt();

        for(int i =1; i<=k; i++) {
            total*=n;
        }

        System.out.println("Cevap: " + total);
    }
}
