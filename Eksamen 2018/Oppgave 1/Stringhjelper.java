class Stringhjelper{
    //t forekommer sammenhengende i teksten s
    public static int inneholder(String s, String t){
        int indeks = 0; boolean sjekk; int lever = -1;
        //sjekker alle tegene i t
        for (int i = 0;i<t.length() ;i++ ) {
            sjekk = false;
            //i2 begynner fra indeks til s.lenght(),alt før indeks er ferdig
            for (int i2 = indeks;i2<s.length() ;i2++ ) {
                //variabel sjekk for å begrenser at det sjekkes bare engang i for-løkke 2
                if (t.charAt(i) == s.charAt(i2)&&sjekk == false) {
                    //denne if kjøres bare ved første gang,der karakteren i t == karakteren i s
                    if(indeks==0 && lever == -1){
                        lever = i2; indeks=i2; sjekk=true;
                    }
                    //sjekker om de er sammenhengende
                    else if(indeks==i2-1){
                        indeks=i2; sjekk=true;
                    }
                    //det er ikke sammenhengende
                    else{
                        return -1;
                    }
                }
            }
        }
        return lever;
    }
    public static void main(String[] args) {
        System.out.println(inneholder("STEIN","EI"));//2
        System.out.println(inneholder("STEIN","SEN"));//-1
    }
}
