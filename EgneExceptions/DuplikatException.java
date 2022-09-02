class DuplikatException extends Exception{
    public DuplikatException(String navn){
        super("Denne tittelen har kommet flere ganger " + navn + ".");
    }
}
