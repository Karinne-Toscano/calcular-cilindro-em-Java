import java.util.Scanner;

public class CalcularAreaCilindro {

   static class Cilindro {
      
   double r;
   double h;
   double pi = Math.PI;

   public Cilindro(double r, double h) {
      this.r = r;
      this.h = h;
  }

   public double calcularAreaTotal() {

   double area_base = 2*(pi*(Math.pow(r, 2)));
   double area_lateral = (2*pi*r)*h;

   double area_total = area_base + area_lateral;

   return area_total;
   }

   public double calcularQuantidadeDeLatas() {
      
      double area_total = calcularAreaTotal();
      double latas = area_total/3;

      return latas;
   }
   public double custoTotal() {
      
      double latas = calcularQuantidadeDeLatas(); 
      double custo = latas*50;

      return custo;
   }

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o raio do cilindro: ");
      double raio = scanner.nextDouble();

      System.out.print("Digite a altura do cilindro: ");
      double altura = scanner.nextDouble();

      Cilindro cilindro = new Cilindro(raio, altura);
      
      double area_total = cilindro.calcularAreaTotal();
      double latas = cilindro.calcularQuantidadeDeLatas();
      double custo = cilindro.custoTotal();

      System.out.printf("Área: %.2f\n", area_total);
      System.out.printf("Quantidade de Latas: %.2f\n", latas);
      System.out.printf("Custo Total: R$%.2f\n", custo);

      scanner.close();
   }

   }

}

