import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SwingMenuTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

    }
}
