class Kvadrater extends GeometriskeFigurer{
    protected double side;
    public Kvadrater(double s){
        side = s;
    }

    @Override
    public double areal(){
        return(side*side);
    }
}
