class Sirkel extends GeometriskeFigurer{
    protected double radius;
    public Sirkel(double r){
        radius = r;
    }
    @Override
    public double areal(){
        return(3.14*radius*radius);
    }
}
