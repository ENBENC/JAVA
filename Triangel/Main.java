class Main{
    public static void main(String[] args) {
        triangel(3,5);
    }
    static void triangel(int m, int n){
        String stjerne ="";
        for(int i = 0; i < m;i++){
            stjerne +="*";
        }
        System.out.println(stjerne);
        if(m == n){//Basissteget
            System.out.println(stjerne);
            return;//Her stopper rekrusjonen.
        }
        else{
            triangel(m+1,n);//rekrusivsteget, som venter til at den siste faller i basissteget.
            System.out.println(stjerne);
        }
    }
}
