import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int goalNumber = randomNumber.nextInt(0,10) + 1;

       int tryNumber = 0;


        Scanner scanner = new Scanner(System.in);
        int numberQuess = 0;

        while(numberQuess != goalNumber){
            System.out.println("1 ile 10 arasında bir sayı giriniz: ");
            tryNumber +=1;
            numberQuess = scanner.nextInt();
            if(numberQuess == goalNumber){
                System.out.println(" Hedef sayı: " + goalNumber + " ile " + " tahmini sayınız: " + numberQuess +  " eşleşiyor");
            }else if(numberQuess > goalNumber){
                System.out.println("Daha düşük bir sayı deneyin...");
            }
            else{
                System.out.println("Daha yüksek bir sayı deneyin...");
            }

        }
    }
}
