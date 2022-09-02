class Main{
    public static void main(String[] args) {
        char [][] ordene ={{'H','A','B','D'},
                   {'M','V','Q','K'},
                   {'P','L','U','G'},
                   {'A','S','R','D'}};
        rekursjon("KURS",ordene,0,0);
    }
    //indeksListe1 = 0{'H','A','B','D'},1{'M','V','Q','K'},2{'P','L','U','G'},3{'A','S','R','D'}
    //indeksListe2 =    0,  1,  2,  3      0   1   2  3       0   1   2   3      0   1   2   3
    //ordene[0][0] = 'H'
    //ordene[0][1] = 'A'
    public static void rekursjon(String ord, char [][] ordene,int indeksListe1,int indeksListe2){
        //Basis steget
        if(indeksListe1 == ordene.length-1 && indeksListe2 == ordene.length){
            return;
        }
        if(indeksListe2 == ordene.length){
            indeksListe2 = 0;
            indeksListe1 ++;
        }
        //Rekursiv steget
        String bokstav = "" + ordene[indeksListe1][indeksListe2];
        if(ord.contains(bokstav)){
            System.out.print(ordene[indeksListe1][indeksListe2]);
            if(indeksListe2 == ordene.length-1){
                System.out.println();
            }
        }
        else{
            System.out.print("*");
            if(indeksListe2 == ordene.length-1){
                System.out.println();
            }
        }
        rekursjon(ord,ordene,indeksListe1,indeksListe2+1);
    }
}
