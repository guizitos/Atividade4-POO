package Atividade3.Questao2;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Guilherme", 5000, "Santo Costa");
        Empregado empregado2 = new Empregado("Lana", 4500, "Santo Costa");

        System.out.println("Empregado: "+ empregado1.getNome() + "\nSalário Anual: "+ empregado1.getSalarioAnual());
        System.out.println("Empregado: "+ empregado2.getNome() + "\nSalário Anual: "+ empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("\n Salário depois do aumento de 10%: ");
        System.out.println("Empregado: "+ empregado1.getNome() + "\nSalário Anual: "+ empregado1.getSalarioAnual());
        System.out.println("Empregado: "+ empregado2.getNome() + "\nSalário Anual: "+ empregado2.getSalarioAnual());
    }
}
