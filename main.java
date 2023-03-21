import java.util.Scanner;


class Main {

    
  public static void main(String[] args) {
    boolean ok = false;
    int integer = 1; //"1"
    double decimal = 1.25;
    String string = "Bom dia!";
    //declaration = assignment
    Scanner s = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String resposta = s.nextLine();
    System.out.println("Você disse que o seu nome é " + resposta);
    System.out.println("Qual é a sua idade?");
    int idade = s.nextInt(); s.nextLine();
    System.out.println("Você disse que tem " + idade + " anos");
    System.out.println("Qual é a sua cor favorita?");
    resposta = s.nextLine();
    System.out.println("Você disse que a sua cor favorita é " + resposta);

    s.nextDouble(); s.nextBoolean();
    //double soma = integer + decimal;
  }



  
}