class CDAlbum implements Comparable<CDAlbum>{
    private String artistnavn;
    private String albumnavn;
    private int utgivelsesaar;
    public CDAlbum(String artistnavn,String albumnavn,int utgivelsesaar){
        this.artistnavn = artistnavn;
        this.albumnavn = albumnavn;
        this.utgivelsesaar = utgivelsesaar;
    }
    public String hentArtistnavn(){
        return artistnavn;
    }
    public String hentAlbumNavn(){
        return albumnavn;
    }
    public int hentUtgivelsesaar(){
        return utgivelsesaar;
    }
    @Override
    public String toString(){
        return "Artist Navn: " + artistnavn +"\n" +
                "Album Navn: " + albumnavn + "\n" +
                "Utgivelsesaar: " + utgivelsesaar;
    }
    @Override
    public int compareTo(CDAlbum cd){//Jo storre boksaven er jo, lengdre bak den er.
        if(artistnavn.compareTo(cd.hentArtistnavn()) > 0){
            return 1;
        }
        else if(artistnavn.compareTo(cd.hentArtistnavn()) < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
