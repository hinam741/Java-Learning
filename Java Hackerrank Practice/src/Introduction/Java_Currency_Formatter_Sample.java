//Bài toán mẫu định dạng tiền tệ sử dụng phương thức Phương thức public static NumberFormat getCurrencyInstance(Locale inLocale)
package Introduction;

import java.text.NumberFormat;
import java.util.Locale;

public class Java_Currency_Formatter_Sample {
    public static void main(String[] args) {
        double amount = 12345.67;

        // Định dạng tiền tệ cho Mỹ
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(amount)); // US: $12,345.67

        // Định dạng tiền tệ cho Nhật Bản
        NumberFormat jpFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Japan: " + jpFormat.format(amount)); // Japan: ￥12,346

        // Định dạng tiền tệ cho Việt Nam
        NumberFormat vnFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        System.out.println("Vietnam: " + vnFormat.format(amount)); // Vietnam: 12.345,67 ₫
    }
}
