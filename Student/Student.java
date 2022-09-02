class Student{
    private String navn;
    private float totalPoeng;
    private float antQuizDeltat;
    public Student(String n){
        navn = n;
        totalPoeng = 0;
        antQuizDeltat = 0;
    }

    public String hentNavn(){
        return navn;
    }
    public void leggTilQuizScore(int score){
        totalPoeng += score;
        antQuizDeltat ++;
    }
    public float hentTotalScore(){
        return totalPoeng;
    }
    public float hentGjennomsnittligScore(){
        System.out.println(antQuizDeltat);
        return (totalPoeng/antQuizDeltat);
    }
}
