class Professor extends Forskere{
    protected String kurs;
    public Professor(String n, int a,int t,String f,String k){
        super(n,a,t,f);
        kurs = k;
    }
}
