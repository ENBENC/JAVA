class Rektangel{
    private double lengde;
    private double bredde;
    public Rektangel (double l, double b){
        lengde = l;
        bredde = b;
    }
    public void oekLengde(int okning){
        lengde = lengde + okning;
    }
    public void oekBredde(int okning){
        bredde = bredde + okning;
    }
    public double areal(){
        double areal;
        areal = lengde * bredde;
        return areal;
    }
    public double omkrets(){
        double omkrets;
        omkrets = (lengde*2) + (bredde*2);
        return omkrets;
    }
    public void reduserLengde(int reduserL){
        if (lengde - reduserL < 0){
            System.out.println("Det er ikke mulig aa redusere lengde.");
        }
        else{
            lengde = lengde - reduserL;
        }
    }
    public void reduserBredde(int reduserB){
        if (bredde - reduserB < 0){
            System.out.println("Det er ikke mulig aa redusere bredde.");
        }
        else{
            bredde = bredde - reduserB;
        }
    }
}
