import java.util.ArrayList;
import java.util.Arrays;
class Main{
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>(Arrays.asList("Hei","paa","deg","igjen","finn","bokstav","a"));
        Monitor monitor = new Monitor(liste);
        for(int i = 0;i<3;i++){
            Thread t = new Thread(new BokstavTeller(monitor,'a'));
            t.start();
        }
    }
}
