public class Main{
    public static void main(String[] args) {
        Q[] objekter = new Q[5];
        //Oppretter objekter[0]
        QABC abc = new QABC();
        QAB ab2 = abc;
        QA a3 = abc;
        G g3 = abc;
        objekter[0] = abc;
        //Oppretter objekter[1]
        QAC ac = new QAC();
        QA a2 = ac;
        objekter[1] = ac;
        //Oppretter objekter[2]
        QAB ab1 = new QAB();
        G g2 = ab1;
        QA a1 = ab1;
        objekter[2] = ab1;
        //Oppretter objekter[3]
        QK k = new QK();
        G g1 = k;
        objekter[3] = k;
        //objekter[4] vil blir null
    }
}
