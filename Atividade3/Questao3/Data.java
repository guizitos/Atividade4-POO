package Atividade3.Questao3;

public class Data {
    public int mes;
    public int dia;
    public int ano;

    public Data(int ano, int dia, int mes) {
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
