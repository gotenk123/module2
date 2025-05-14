
import java.util.Scanner;
import java.util.Arrays;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("số lượng sinh vien");
        int a = scanner.nextInt();
        double[] number = new double[a];
        double sum = 0;
        double b = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("Điểm số của sinh viên thu " + (i + 1) + " là");
            number[i] = scanner.nextDouble();
            sum += number[i];
        }
        double diemtrungbinh = sum / a;
        System.out.println(Arrays.toString(number));
        System.out.println("Điểm trung bình của các sinh viên là" + diemtrungbinh);
        for (int y = 0; y < number.length; y++) {
            if (number[y] >= 5) {
                b++;
            }
        }
        System.out.println("Số lượng sinh viên có điểm >=5 là :" + b);
        Arrays.sort(number);
        double min = number[0];
        double max = number[number.length - 1];

        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Số lớn nhất là: " + max);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                System.out.println("Tìm thấy tại vị trí " + (i++) + ", giá trị: " + number[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");

        }
    }
}