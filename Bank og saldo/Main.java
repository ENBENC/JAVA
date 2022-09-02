class Main{
    public static void main(String[] args) {
        int antallGanger = Integer.parseInt(args[0]);
        Bank bank = new Bank();
        for(int i=0;i<10;i++){
            Thread t = new Thread(new Arbeider(bank,antallGanger));
            t.start();
        }
    }
}
