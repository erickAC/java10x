package br.com.javaninja.NivelIntermediario;

public class Main {

  public static void main(String[] args) {

    // Criar ninja naruto
    Uzumaki naruto = new Uzumaki();
    naruto.nome = "Naruto Uzumaki";
    naruto.aldeia = "Aldeira da folha";
    naruto.idade = 17;
    naruto.modoSabio();

    // Criar ninja sasuke uchiha - sasuke é um objeto
    Uchiha sasuke = new Uchiha();
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
    Haruno sakura = new Haruno();
    sakura.nome = "Sakura";
    sakura.aldeia = "Aldeia da folha";
    sakura.idade = 17;
    sakura.ativarCura();

    Hyuga hinata = new Hyuga();
    hinata.nome = "Hinata";
    hinata.aldeia = "Aldeia da folha";
    hinata.idade = 17;
    hinata.ativarByakugan();

  }

}
