import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    System.out.println("Kalkulator");
    
    while (true) {
      System.out.println("1.Pole Prostokąta 2. Pole Trókąta Prostokątnego");
      int wybor = skan.nextInt();
      System.out.println("Podaj liczbe a:");
      float a = skan.nextFloat();
      System.out.println("Podaj liczbe b:");
      float b = skan.nextFloat();
      
      
      switch (wybor) {
        case 1:
          System.out.println("Pole prostokąta wynosi: " + a * b);
          break;
        case 2:
          System.out.println("Pole trójkąta wynosi: " + (a*b)/2);
          break;
        default:
          System.out.println("Nieprawidłowy wybor");
          break;
      }
    }
  }
}