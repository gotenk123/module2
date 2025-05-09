import java.util.Scanner;

public class tinhtiendien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kWh,tiendien,muc1,muc2;
        System.out.print("Your kWh (in Kilowatt-hour):");
        kWh = scanner.nextDouble();
        System.out.printf("%-20s%s", "kWh", "Interpretation\n");
        if (kWh <50){
            tiendien=kWh*1800;
        } else if (kWh < 100) {
            muc1=50*1800;
            tiendien=muc1+(kWh-50)*2300;
        } else {
            muc1=50*1800;
            muc2=100*2300;
            tiendien=muc1+muc2+(kWh - 100)*3000;
        }
        System.out.println("Số điện bạn đã sử dụng là :" + kWh);
        System.out.print("Tiền đien của bạn là :" + tiendien );
    }
}
