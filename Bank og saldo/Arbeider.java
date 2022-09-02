class Arbeider implements Runnable{
    private Bank bank;
    private int antallGanger;
    public Arbeider(Bank b,int a){
        bank = b;
        antallGanger = a;
    }
    @Override
    public void run(){
        int penger = 1000;
        for(int i=0;i<antallGanger;i++){
            bank.gi(penger);
            System.out.println(i + ".Banksaldo etter gi: " + bank.saldo());
            bank.ta(penger);
            System.out.println(i + ".Banksaldo etter ta: " + bank.saldo());
        }
    }
}
