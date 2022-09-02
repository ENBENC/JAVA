public static void main(String[] args) {
    int x = 3;
    int y = 4;
    variabelBytte(x, y);
    System.out.println(x + " " +y);
}

public static void variabelBytte(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
//Det fungerer ikke som det skal fordi,først så peker a på x og b peker på y.
//Deretter så peker temp på a og a peker på b.
//Så peker b på temp, til slutt så peker hverken a eller b på x og y.
//Dermed blir ikke variablene byttet.
//Metoden returnerer heller ikke en verdi dermed ingen av variabelene i main opptatteres.
