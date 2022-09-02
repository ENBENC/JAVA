class AdministratorLege extends OverLege implements EkstraUtdanning{
    String ansvarskode;
    public AdministratorLege(String a,String n,int l,String s,String ansvar){
        super(a,n,l,s);
        ansvarskode = ansvar;
    }
    public String hentAnsvarskode(){
        return ansvarskode;
    }
}
