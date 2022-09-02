import java.util.concurrent.CountDownLatch;
class Main{
    public static void main(String[] args) {
        StemmeBoks stemmeboks = new StemmeBoks();
        CountDownLatch countDown = new CountDownLatch(435);
        for(int i=0;i<435;i++){
            Thread traad = new Thread(new Elev(stemmeboks,countDown));
            traad.start();
        }
        System.out.println("Venter til alle elevene har stemmet");
        System.out.println();
        try {
            countDown.await();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Alle elevene har stemmet");
        System.out.println();
        System.out.println("Det ble " + stemmeboks.telleStemmen() + " til fredag.");
    }
}
