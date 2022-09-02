import java.util.Random;
class Postmann implements Runnable{
    private final Postkontor monitor;
    private String[] navnene = new String[2];
    public Postmann(Postkontor monitor,String navn0,String navn1){
        this.monitor = monitor;
        navnene[0] = navn0;
        navnene[1] = navn1;
    }
    @Override
    public void run(){
        Random random = new Random();
        for(int i=0;i<10;i++){
            int tall = random.nextInt(2);//gir et random tall fra 0-1
            Post p = new Post("Brev: "+i,navnene[tall]);
            monitor.leverPost(p);
        }
    }
}
