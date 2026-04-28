import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cargaProjeto = 15.0;
        double limiteSeguranca = cargaProjeto * 0.8;

        System.out.println("--- Sistema SafeBuild: Monitormento de Carga ---");
        System.out.println("Digite a leitura atual do sensor (kN/m²): ");
        double cargaAtual = scanner.nextDouble();
        
        if(cargaAtual < limiteSeguranca){
            System.out.println("Status: Verde");
            System.out.println("Decisão: Operação normal. Carga dentro dos parametros de segurança.");

        } else if(cargaAtual >= limiteSeguranca && cargaAtual <= cargaProjeto){
            System.out.println("Status: Amarelo");
            System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não essencial.");

        } else{
            System.out.println("Status: Vermelho(Critico)");
            System.out.println("Decisão: Interromper Imediatamente! Risco dde colapso das escoras");

        
            if(cargaAtual > (cargaProjeto * 1.2)){
                System.out.println("Alerta Adicional: Possivel falha catastrofica iminente. Evacuar área total.");
            }
        } 
        scanner.close()
    }
}
