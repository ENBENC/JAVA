import java.util.Scanner;
public class Hallo{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Hei! Hva heter du?");
    String user = myObj.nextLine();
    System.out.println("Hei " + user + "! Velkommen til IN1O1O.");

  }
}
