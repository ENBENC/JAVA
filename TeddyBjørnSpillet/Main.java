class Main{
    public static void main(String[] args) {
        System.out.println(teddy(250));
        System.out.println(teddy(42));
        System.out.println(teddy(84));
        System.out.println(teddy(53));
        System.out.println(teddy(41));
    }

    // public static boolean teddy(int n,String path){//path for å sjekke om rekursjon har vært i n. Der path er en string med eks. path = "n1 n2 n3 n4"
    //    if(n == 42){
    //         return true;
    //     }
    //     if(n <= 0 || path.contains("" + n)){
    //         return false;
    //     }
    //     if(n%5 != 0 && n%2 != 0 && n%3 != 0 && n%4 != 0){
    //         return false;
    //      }
    //
    //     Boolean sjekk1 = true;
    //     Boolean sjekk2 = true;
    //     Boolean sjekk3 = true;
    //     if(n%2 == 0){
    //         sjekk1 = teddy(n/2,path += " "+(n/2));
    //     }
    //     if(n%3 == 0 || n%4 ==0){
    //         int tall = (n%10) + ((n%100)/10);
    //         sjekk2 = teddy(tall, path += " "+tall);
    //     }
    //     if(n%5 ==0){
    //         sjekk3 = teddy(n-42, path += " " + (n-42));;
    //     }
    //     return(sjekk1 || sjekk2 || sjekk3);
    // }
    // public static boolean teddy(int n){//mangler path som sjekker om rekursjon har vært i tallet n eller ikke
    //     if(n == 42){
    //         return true;
    //     }
    //     if(n <= 0){
    //         return false;
    //     }
    //     if(n%5 != 0 && n%2 != 0 && n%3 != 0 && n%4 != 0){
    //         return false;
    //      }
    //     if(n%2 == 0){
    //         boolean sjekk1 = teddy(n/2);
    //         if(sjekk1){
    //             return true;
    //         }
    //     }
    //     if(n%3 == 0 || n%4 ==0){
    //         int tall = (n%10) + ((n%100)/10);
    //         boolean sjekk2 = teddy(tall);
    //         if(sjekk2){
    //             return true;
    //         }
    //     }
    //     if(n%5 ==0){
    //         boolean sjekk3 = teddy(n-42);
    //         if(sjekk3){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static boolean teddy(int n){
        return  teddyRekursiv(n, "");
    }
    public static boolean teddyRekursiv(int n, String path){
    if(n == 42){
        return true;
     }
      if(n <= 0 || path.contains(""+n)){
        return false;
      }

      if(n%5 != 0 && n%2 != 0 && n%3 != 0 && n%4 != 0){
        return false;
      }

      boolean loypeEn = true;
      boolean loypeTo = true;
      boolean loypeTre = true;

      if(n%5 == 0){
        loypeEn = teddyRekursiv(n-42, path += " " + (n-42));
      }
      if(n%2 == 0){
        loypeTo = teddyRekursiv(n/2, path += " " + n/2);
      }
      if(n%3 == 0 || n%4 == 0){
        int nyttTall = (n%10) + ((n%100)/10);
        loypeTre = teddyRekursiv(nyttTall, path += " " + nyttTall);

      }
      System.out.println("1" +loypeEn);
      System.out.println("2" +loypeTo);
      System.out.println("3" +loypeTre);
      System.out.println();
      return (loypeEn || loypeTo || loypeTre);
    }

}
