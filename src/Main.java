import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money money = new Money();
        System.out.println("Nhập số tiền:");
        double value = Double.parseDouble(sc.nextLine());
        System.out.println("1. Chuyển từ VND sang USD");
        System.out.println("2. Chuyển từ USD sang VND");
        int choise = Integer.parseInt(sc.nextLine());
        if (choise == 1) {
            double USD = money.fromVNDToUSD(value);
            System.out.println(USD);
        }else {
            double VND = money.fromUSDtoVND(value);
            System.out.println(VND);
        }
    }
}
