class Main{
    public static void main(String[] args) {
        System.out.println(gcd(20,30));
        System.out.println(gcdIterativ(20,30));
        System.out.println(gcdSvar(20,30));
    }

    static int gcd(int a, int b){
        if(a >= b == false){ //Sjekker om a>=b;
            return gcd(b,a);
        }
        else{
            int c = a % b;
            if(c == 0){//Sjekker om c == 0; hvis c = 0, så return b,
                return b;
            }
            else{
                return gcd(b,c); //Dersom c != 0, da setter vi a = b og b =c; og sender de videre.
            }
        }
    }
    static int gcdIterativ(int a, int b){
        int tmp1 = a;
        int tmp2 = b;
        if( a >= b == false){
            a = tmp2;
            b = tmp1;
        }
        int c = a % b;
        while(c != 0){
            a = tmp2;
            b = c;
            c = a % c;
        }
        return b;
    }

    public static int gcdSvar (int a, int b) {
       if (a < b) {
           int t = a;
           a = b;
           b = t;
       }

       int c = a % b;

       if (c == 0) {
           return b;
       } else {
           return gcd(b, c);
       }
    }
}
