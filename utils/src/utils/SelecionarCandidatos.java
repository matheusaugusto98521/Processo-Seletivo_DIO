package utils;

import java.util.ArrayList;
import java.util.List;

public class SelecionarCandidatos {

    private static final int LIMITE_DA_LISTA = 5;

    public List<String> escolherCandidato(double salPretendido, String candidato, List<String> escolhidos){
        if (!escolhidos.contains(candidato)) {
            // Verifica se ainda há espaço para adicionar candidatos
            if (escolhidos.size() < LIMITE_DA_LISTA) {
                if (salPretendido < 2000.0) {
                    System.out.println("Ligar para o candidato: " + candidato);
                    escolhidos.add(candidato);
                } else if (salPretendido == 2000.0) {
                    System.out.println("Ligar com contra proposta para o candidato: " + candidato);
                    escolhidos.add(candidato);
                } else {
                    System.out.println("Aguardando resultado dos demais candidatos");
                }
            } else {
                System.out.println("Limite de candidatos atingido. Não é possível adicionar " + candidato);
            }
        } else {
            System.out.println("O candidato " + candidato + " já foi adicionado.");
        }

        return escolhidos;
    }

    public void mostrarEscolhidos(List<String> candidatosEscolhidos){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(">>>>>>> CANDIDATOS ESCOLHIDOS <<<<<<<");
        candidatosEscolhidos.forEach(candidato -> {
            System.out.println(">>> Candidato: " + candidato);
        });
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void fazerLigacao(List<String> escolhidos){
        escolhidos.forEach(candidato -> {
            int tentativas = 0;
            boolean atendeu = false;

            while (tentativas < 3 && !atendeu) {
                tentativas++;
                // Aqui você pode definir a lógica para "atender" ou não (simulação com random)
                atendeu = Math.random() < 0.2; // 50% de chance de atender

                if (atendeu) {
                    System.out.println("Conseguimos contato com o " + candidato + " após " + tentativas + " tentativas");
                }
            }

            // Após 3 tentativas, verifica se atendeu
            if (!atendeu) {
                System.out.println("Não conseguimos contato com o candidato: " + candidato);
            }
        });
    }
}
