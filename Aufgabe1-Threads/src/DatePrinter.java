import java.util.Date;

public class DatePrinter implements Runnable {

    private static Object Date;

    public DatePrinter() {
        Date = new Date();
    }

    public void run() {

        int counter = 0;
        while (counter<20){
            System.out.println(Date);
            counter++;
        }
    }
}
