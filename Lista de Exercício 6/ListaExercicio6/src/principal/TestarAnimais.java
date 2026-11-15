package principal;

import model.Mamifero;
import model.Peixe;
import model.Animal;

public class TestarAnimais {

    public static void main(String[] args) {

        Animal camelo = new Animal(
                "Camelo",
                150.0f,
                4,
                "Amarelo",
                "Terra",
                2.0f
        );

        camelo.dados();

        Peixe tubarao = new Peixe(
                "Tubarão",
                300.0f,
                0,
                "Cinzento",
                "Mar",
                1.5f,
                "Barbatanas e cauda"
        );

        tubarao.dados();

        Mamifero urso = new Mamifero(
                "Urso-do-Canadá",
                180.0f,
                4,
                "Vermelho",
                "Terra",
                0.5f,
                "Mel"
        );

        urso.dados();

    }

}