import java.util.Scanner;

public class Transfers {
    private double VND;
    private double USD;

    public Transfers() {
    }

    public double getVND() {
        return VND;
    }

    public void setVND(double VND) {
        this.VND = VND;
    }

    public void fromVNDToUSD(double num) {
        this.USD = num / 23000;
    }

    public void fromUSDtoVND(double num2) {
        this.VND = num2 * 23000;
    }



    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    @Override
    public String toString() {
        return "Transfers{" +
                "VND=" + VND +
                ", USD=" + USD +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transfers transfers = new Transfers();
        System.out.println("Nhập số tiền:");
        double num = Double.parseDouble(sc.nextLine());
        System.out.println("1. Chuyển từ VND sang USD");
        System.out.println("2. Chuyển từ USD sang VND");
        int choise = Integer.parseInt(sc.nextLine());
        if (choise == 1) {
            transfers.setVND(num);
            transfers.fromVNDToUSD(num);

        }else {
            transfers.setUSD(num);
            transfers.fromUSDtoVND(num);
        }

        System.out.println(" Tiền VND: " + transfers.getVND() + " USD: " +transfers.getUSD());
    }
}
