package principal;


import model.Administrador;
import model.Empregado;
import model.Operario;
import model.Vendedor;

public class TestarHerança {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua A", "123456789", 1, 2000.0, 10.0);
        Vendedor vendedor = new Vendedor("Maria", "Rua B", "987654321", 2, 2500.0, 15.0, 50000.0, 5.0);
        Operario operario = new Operario("Carlos", "Rua C", "456789123", 3, 1800.0, 8.0, 30000.0, 3.0);
        Administrador administrador = new Administrador("Ana", "Rua D", "321654987", 4, 3000.0, 12.0, 500.0);

        System.out.println("Empregado:");
        empregado.dados();
        System.out.println("Salário: " + empregado.calcularSalario());
        System.out.println();

        System.out.println("Vendedor:");
        vendedor.dados();
        System.out.println("Salário: " + vendedor.calcularSalario());
        System.out.println();

        System.out.println("Operário:");
        operario.dados();
        System.out.println("Salário: " + operario.calcularSalario());
        System.out.println();

        System.out.println("Administrador:");
        administrador.dados();
        System.out.println("Salário: " + administrador.calcularSalario());
    }
    
}
