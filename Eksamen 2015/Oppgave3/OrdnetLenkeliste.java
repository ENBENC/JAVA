class OrdnetLenkeliste{
    public static void main(String[] args) {
        Liste<String> ordliste = new Liste<String>();
        String[] navn = new String[]{"I","dag","er","det","eksamen","i","INF1010.\n","Jeg", "haaper","du","liker","denne","oppgaven.\n","Lykke" ,"til!" ,"hilsen", "oppgaveforfatteren.\n"};
        for (String n : navn) {
            ordliste.settInn(n);
        }
        System.out.println();
        ordliste.skrivAlle();
        System.out.println();
    }
}
