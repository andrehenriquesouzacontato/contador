import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        while (true) {
            try {
                System.out.println("Contador atual: " + contador);
                System.out.println("Digite 'incrementar' para aumentar o contador ou 'sair' para finalizar:");
                String comando = scanner.nextLine();
                
                if (comando.equalsIgnoreCase("incrementar")) {
                    contador++;
                } else if (comando.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    System.out.println("Comando inválido. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
        
        scanner.close();
        System.out.println("Programa encerrado. Contador final: " + contador);
    }
}
