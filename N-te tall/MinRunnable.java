
class MinRannable implements Runnable{
    private final int fra, til;
    private final int N;
    private final Monitor monirot;
    public MinRannable(int n,int fra,int til, Monitor m){
        this.N = n;
        this.fra = fra;
        this.til = til;
        monirot = m;
    }
    @Override
    public void run(){
        for(int i = fra; i < til; i++){
            if(i%10 == N){
                monirot.skrivUt(i);
            }
        }
    }
}
