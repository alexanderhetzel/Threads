public class CountPrinter implements Runnable {

    int counter;

    public CountPrinter() {
        counter = 1;
    }

    public void run(){
        while (counter<=20){
            System.out.println(counter);
            counter++;
        }
    }
}
