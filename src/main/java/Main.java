import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Usuario");
String Login = sc.nextLine();

 System.out.println("Senha:");

    int senha =  sc.nextInt();

  while( senha!= 2022) {
    System.out.println("Senha incorreta");
    System.out.println(" ");
    System.out.println("Senha novamente:");
    senha = sc.nextInt();
  }
if (senha == 2022) {
}
     sc.close();
  }
}
