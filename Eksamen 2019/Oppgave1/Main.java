class Main{
    public static void main(String[] args) {
        Tidspunkt tid1 = new Tidspunkt(2019,3,2,3,12,12);

        Tidspunkt tid2 = new Tidspunkt(2018,3,1,3,12,1);
        Tidspunkt tid3 = new Tidspunkt(2019,3,1,3,12,1);
        Tidspunkt tid4 = new Tidspunkt(2019,3,2,3,12,30);

        Tidspunkt[] listeTidspunkt = {tid1,tid2,tid3,tid4};
        for (Tidspunkt t :listeTidspunkt ) {
            System.out.println(tid1.compareTo(t));
        }
    }
}
