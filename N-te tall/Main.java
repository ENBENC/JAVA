class Main{
    public static void main(String[] args) {
        Monitor m = new Monitor();
        for(int i = 0; i<10 ;i++){
            new Thread(new MinRannable(i,0,1000,m)).start();
        }
    }
}
