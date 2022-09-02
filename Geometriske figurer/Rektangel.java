class Rektangel extends GeometriskeFigurer{
    protected double bredde;
    protected double hoyde;
    public Rektangel(double b,double h){
        bredde = b;
        hoyde = h;
    }
    @Override
    public double areal(){
        return(bredde*hoyde);
    }
}
