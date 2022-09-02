class Trekant extends GeometriskeFigurer{
    protected double hoyde;
    protected double bredde;
    public Trekant(double h,double b){
        hoyde = h;
        bredde = b;
    }
    @Override
    public double areal(){
        return ((hoyde*bredde)/2);
    }
}
