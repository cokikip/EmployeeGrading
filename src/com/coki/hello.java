import java.util.Calendar;

/**
 * hello
 */
public class hello {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);

        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        System.out.println("Financial month : " + month);
        if (month < 6) {
            System.out.println("Financial Year : " + (year - 1) + "-" + year);
        } else {
            System.out.println("Financial Year : " + year + "-" + (year + 1));
        }
    }
}