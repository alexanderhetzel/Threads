/*  Erkenntnis aus folgendem Programm:
        - Was fällt auf?
            + Die Ausgabe der Zahl ist in der Berechnung schneller, d.h. die Zahlen werden als erstes, die Daten (Datum) als zweites ausgegeben
        -Ändere nun dein Programm, sodass jeweils mehr Ausgaben je Thread erfolgen (200, 2000, 20000, ...) - was beobachtest du dabei?
            + Das Datum braucht wesentlich länger bei erster Ausgabe als die Zahl (erst nach 2048 Zahlen kam das erste Datum)
            + Das Datum kommt nicht so frequent wie die Zahl
 */



import java.util.Date;

public class Main {

    public static void main(String[] args) {

        DatePrinter dp1= new DatePrinter();
        Thread th1= new Thread(dp1);
        CountPrinter cp1= new CountPrinter();
        Thread th2= new Thread(cp1);


        th1.start();
        th2.start();
    }
}
