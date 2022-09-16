import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int maxNumber =0;
        int minNumber= 0;
        Scanner input =new Scanner(System.in);
        System.out.print("Kaç Sayı Girmek İstersiniz = ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i+".sayı = ");
            number = input.nextInt();
            if (i == 1){
                minNumber = number;
            }
            if (maxNumber<=number){
                maxNumber = number;
            }

            if (minNumber>=number){
                minNumber = number;
            }

        }
        System.out.println("En Büyük Sayı = "+maxNumber);
        System.out.println("En Küçük Sayı = "+minNumber);

    }
}
