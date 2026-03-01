package br.com.javaninja.NivelIntermediario;

public class Ninja {
  String nome;
  String aldeia;
  int idade;

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
