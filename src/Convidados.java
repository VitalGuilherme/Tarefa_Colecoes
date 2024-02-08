import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author VitalGuilherme 
 */
public class Convidados {

    public static void main(String args[]) {

        listaDeConvidados();
        separarPorGeneros();
    }

    private static void listaDeConvidados() {
        System.out.println("Digite os nomes dos convitados na lista: ");
        List<String> convidados = new ArrayList<>();
        convidados.add("João Vitor");
        convidados.add("Maria Julia");
        convidados.add("Felipe");
        convidados.add("Bruna");
        convidados.add("Tiago");
        convidados.add("Amanda");
        convidados.add("Erick");
        convidados.add("Sabrina");
        Collections.sort(convidados);
        System.out.println(convidados);
    }

    private static void separarPorGeneros () {
        String generoM = "João Vitor - M; Maria Julia - F; Felipe - M; Bruna - F; Tiago - M; Amanda - F; Erick - M; Sabrina - F";
        System.out.println("***** Masculino *****\n");
        String[] genero = generoM.split(";");
          String genero1 = genero[0];
          String genero2 = genero[2];
          String genero3 = genero[4];
          String genero4 = genero[6];
          System.out.println(genero1 +  "\n" +  genero2 + "\n" + genero3 + "\n" + genero4);


          System.out.println("\n***** Feminino *****\n");
        String genero5 = genero[1];
        String genero6 = genero[3];
        String genero7 = genero[5];
        String genero8 = genero[7];
        System.out.println(genero5 +  "\n" +  genero6 + "\n" + genero7 + "\n" + genero8); }

}