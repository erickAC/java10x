package br.com.javaninja.NivelIntermediario;

public class Main {

  public static void main(String[] args) {

    // Criar ninja naruto
    Ninja naruto = new Ninja();
    naruto.nome = "Naruto Uzumaki";
    naruto.aldeia = "Aldeira da folha";
    naruto.idade = 17;

    // Criar ninja sasuke uchiha - sasuke é um objeto
    Ninja sasuke = new Ninja();
    sasuke.nome = "Sasuke Uchiha";
    sasuke.aldeia = "Aldeia da folha";
    sasuke.idade = 18;
    // applying method
    sasuke.sharinganAtivado();
    String chamandoMetodo = sasuke.euSouUmNinja();
    System.out.println(chamandoMetodo);

    int quantoTempoFalta = sasuke.anosPraSeTornarHokage(70);
    System.out.println("Voce tem: " + sasuke.idade + " entao falta no minimo: " + quantoTempoFalta);

    // Cria sakura
    Ninja sakura = new Ninja();
    sakura.nome = "Sakura";
    sakura.aldeia = "Aldeia da folha";
    sakura.idade = 17;

  }

}
