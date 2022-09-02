class TestStudent{
    public static void main(String[] args){
        Student student1 = new Student("Joakim");
        Student student2 = new Student("Kristin");
        Student student3 = new Student("Dag");
        student1.leggTilQuizScore(1);
        student1.leggTilQuizScore(4);
        student2.leggTilQuizScore(4);
        student2.leggTilQuizScore(2);
        student3.leggTilQuizScore(2);
        student3.leggTilQuizScore(9);
        System.out.println(student1.hentTotalScore());
        System.out.println(student1.hentGjennomsnittligScore());
    }
}
