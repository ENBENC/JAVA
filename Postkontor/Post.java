class Post{
    private String innhold;
    private String mottaker;

    public Post(String i,String m){
        innhold = i;
        mottaker = m;
    }
    public String hentInnhold(){
        return innhold;
    }
    public String hentMottaker(){
        return mottaker;
    }
}
