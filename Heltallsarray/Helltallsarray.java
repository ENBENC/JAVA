class Helltallsarray{
    public static void main(String[] args){
        int zero = 0;
        int en = 1;
        int to = 2;
        int tre = 3;
        int fire = 4;
        System.out.println("Tallene: " + zero + en + to + tre + fire);
        int [] array = new int[5];
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        for(int i: array){
            System.out.println(i);
        }
    }
}
