public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(1, "Mouse", 2, 50.00);

    System.out.println("Número do item: " + invoice.getNumeroItem());

    System.out.println("Descricao: " + invoice.getDescricao());

    System.out.println("Quantidade: " + invoice.getQuantidade());

    System.out.println("Preço: " + invoice.getPreco());

    System.out.println("Valor total: " + invoice.getInvoiceAmount());

    Empregado empregado1 = new Empregado("Icaro", "Carmo", 2000.00);

    Empregado empregado2 = new Empregado("Joao", "Silva", 3000.00);
    
    System.out.println("Nome: " + empregado1.getNome());

    System.out.println("Sobrenome: " + empregado1.getSobrenome());

    System.out.println("SalarioMensal: " + empregado1.getSalarioMensal());

    System.out.println("SalarioAnual: " + empregado1.getSalarioAnual());

    System.out.println("Nome: " + empregado2.getNome());

    System.out.println("Sobrenome: " + empregado2.getSobrenome());

    System.out.println("SalarioMensal: " + empregado2.getSalarioMensal());

    System.out.println("SalarioAnual: " + empregado2.getSalarioAnual());

    empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.10);
    empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.10);

    System.out.println("Novo salario mensal: " + empregado1.getSalarioMensal());
    System.out.println("Novo salario mensal: " + empregado2.getSalarioMensal());

    System.out.println("Novo salario anual: " + empregado1.getSalarioAnual());
    System.out.println("Novo salario anual: " + empregado2.getSalarioAnual());

    }



}