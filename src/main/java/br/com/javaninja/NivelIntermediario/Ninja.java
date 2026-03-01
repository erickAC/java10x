package br.com.javaninja.NivelIntermediario;

public class Ninja {
  String nome;
  String aldeia;
  int idade;

  // create a custom method

  /**
   * dont return in void method
   */
  public void sharinganAtivado() {
    System.out.println("Sharingan ativado!");
  }

  /***
   * @return return a string
   */
  public String euSouUmNinja() {
    return "Eu so um ninja";
  }

  /**
   * @return return an integer
   */
  public int anosPraSeTornarHokage(int idadeMinimaParaSerHokage) {
    return idadeMinimaParaSerHokage - idade;
  }

}
