import java.io.FileNotFoundException;
class Test{
    public static void main(String[] args) throws FileNotFoundException{
        Studentsystem s = new Studentsystem("emnestudenter.txt");
        System.out.println(s.fagMedFlestStudnet());// riktig
        System.out.println();
        s.skrivUtStudenterIFag("*MAT1001");//riktig
        s.skrivUtAlleFagEnStudentTar("Jonathan");//riktig
        s.leggTilNyFag("*MAT1111");//riktig
        s.skrivAlleFag();//riktig
        System.out.println();
        s.fjerneFag("*MAT1111");//riktig
        s.skrivAlleFag();
        System.out.println();
        System.out.println(s.studentSomTarFlestFag());

    }
}
