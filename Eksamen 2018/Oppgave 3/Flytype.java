class FlyType{
    private String type,seteinfo;
    public FlyType(String t,String s){
        type = t; seteinfo = s;
    }
    public Flygning opprettFlygning(String flyNummer){
        return new Flygning(seteinfo,flyNummer);
    }
}
