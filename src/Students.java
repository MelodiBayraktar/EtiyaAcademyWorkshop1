import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayısı giriniz: ");
        int students = scanner.nextInt();



        for(int i = 0; i < students; i++){
            System.out.println("Öğrenci adını giriniz");
            String studentName = scanner.next();
            System.out.println("Öğrenci soyadını giriniz");
            String studentSurname = scanner.next();
            System.out.println("Öğrencinin 1. sınav notunu giriniz: ");
            double exam1 = scanner.nextDouble();
            System.out.println("Öğrencinin 2. sınav notunu giriniz: ");
            double exam2 = scanner.nextDouble();
            System.out.println("Öğrencinin 3. sınav notunu giriniz: ");
            double exam3 = scanner.nextDouble();
            ortalamaHesaplama(exam1, exam2, exam3);
        }
    }
    public static double ortalamaHesaplama(double exam1, double exam2, double exam3){
        double ortalama = (exam1 + exam2 + exam3) /3;
        return ortalama;

    }

}
