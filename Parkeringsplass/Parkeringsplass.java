class Parkeringsplass<T>{
    T kjoreToy = null;

    public void settInnKjoreToy(T k){
        kjoreToy = k;
    }
    public T hentUtKjoreToy(){
        T hentKjoreToy = kjoreToy;
        kjoreToy = null;
        return hentKjoreToy;
    }
}
