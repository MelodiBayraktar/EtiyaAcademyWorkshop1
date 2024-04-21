import java.util.Scanner;

public class ShoppingAmount {
    public static void main(String[] args) {
        double totalPrice = 0;
        double productPrice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane ürün satın almak istiyorsunuz? ");
        int productNumber = scanner.nextInt();
        for(int i = 1; i <= productNumber; i++){
            System.out.println(i + ". ürünün fiyatı: ");
            productPrice = scanner.nextDouble();
            totalPrice += productPrice;
        }
        System.out.println("Alışveriş tutarı: " + totalPrice);
    }
}