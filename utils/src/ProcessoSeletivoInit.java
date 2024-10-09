import utils.SelecionarCandidatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessoSeletivoInit {

    public static void main(String[] args) {
        SelecionarCandidatos selecionarCandidatos = new SelecionarCandidatos();
        List<String> candidatos = Arrays.asList("Marcelo", "Renata", "André", "Ricardo", "Giovanne", "Matheus", "Amélia");
        List<String> escolhidos = new ArrayList<>();
        candidatos.forEach(candidato -> {
            double salPretendidoAleatorio = gerarNovoDouble(1750.0, 2200.0);
            selecionarCandidatos.escolherCandidato(salPretendidoAleatorio, candidato, escolhidos);
        });
        System.out.println();
        selecionarCandidatos.mostrarEscolhidos(escolhidos);
        System.out.println();
        selecionarCandidatos.fazerLigacao(escolhidos);

    }

    public static double gerarNovoDouble(double minValor, double maxValor){
        return minValor + (Math.random() * (maxValor - minValor));
    }


}