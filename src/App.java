import java.util.Scanner;       

public class App {
    public static void main(String[] args) throws Exception {
        
System.out.println("Beneficios do consumo de água");
    
Scanner scanner = new Scanner(System.in);

System.out.println("Informe seu nome:");
String nome = scanner.nextLine();

System.out.println("Informe seu peso atual em kg:");
double peso = scanner.nextDouble();

System.out.println("Informe a quantidade de água já ingerida em litros:");
double água = scanner.nextDouble();
    
double quantidadeIdeal = peso * 35;
double quantidadeRestante = quantidadeIdeal - água;

System.out.println("Nome do funcionário: " + nome);
System.out.println("Peso atual em kg: " + peso);
System.out.println("Quantidade de água já ingerida em litros: " + água);
System.out.println("Quantidade ideal de água a ingerir por dia: " + quantidadeIdeal + " litros");

if (quantidadeRestante > 0) {
    System.out.println("Falta ingerir " + quantidadeRestante + " de água para atingir a quantidade ideal. Beba mais água!");

} else if (quantidadeRestante == 0) {
    System.out.println("Você já atingiu a quantidade ideal de água para o dia.");

} else {
    System.out.println("Você já ingeriu " + (-quantidadeRestante) + " de água a mais do que o necessário para o dia");
}


  }
}
