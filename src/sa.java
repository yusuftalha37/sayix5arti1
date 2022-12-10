import java.util.Scanner;
public class sa {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Lütfern bir sayı giriniz");
        int sayı;
        sayı = input.nextInt();
        sayı=sayı+1;
        System.out.println(sayı);
        sayı = sayı*=5;
        System.out.println(sayı);
    }
}
