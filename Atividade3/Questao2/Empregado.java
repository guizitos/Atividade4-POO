package Atividade3.Questao2;

public class Empregado {
    public String Nome;
    public String Sobrenome;
    public double SalarioMensal;

    public Empregado(String Nome, double SalarioMensal, String Sobrenome) {
        this.Nome = Nome;
        this.SalarioMensal = SalarioMensal;
        this.Sobrenome = Sobrenome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public double getSalarioMensal() {
        return SalarioMensal;
    }

    public void setSalarioMensal(double SalarioMensal) {
        this.SalarioMensal = SalarioMensal;
    }

    public double getSalarioAnual() {
        return SalarioMensal * 12;
    }

    public void aumentarSalario(double percentual) {
        SalarioMensal += SalarioMensal * (percentual /100);
    }

}
