import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos();
        imprimiorSelecionados(); // Chamando a função selecaoCandidatos()
    }

    static void imprimiorSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "MATHEUS", "ROGERIO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase= 2000.0;

        while(candidatosSelecionados < 9 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
