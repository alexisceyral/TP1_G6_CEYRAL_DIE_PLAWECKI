

public class countdown {
    public static void countdown() {
        for (int i = 10; i >= 0;) {
            System.out.println(i);
            i=i-1;
            try {
                Thread.sleep(500); // wait 0.5 second between each number
            } catch (InterruptedException e) {
                e.printStackTrace();}
        }

        System.out.println("BOOM!");
    }
    public static void main(String[] args) {
        countdown();
    }
}
