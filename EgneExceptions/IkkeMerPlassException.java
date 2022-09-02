class IkkeMerPlassException extends Exception{
    public IkkeMerPlassException(String id){
        super("Det er ikke mer plass for " + id + ".");
    }
    public String getMassage(){
        return "HEi";
    }
}
