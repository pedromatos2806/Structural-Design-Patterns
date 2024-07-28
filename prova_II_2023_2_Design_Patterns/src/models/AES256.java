package models;

public class AES256 {
	/*
	* Método para a inicialização do AES através de SecretKey
	* gerada de forma aleatória através de KeyGenerator
	*/
	public void init(){
		System.out.println("\nIniciou o AES256!");
	};
	/*
	* Método para a inicialização do AES através de chave fornecida
	* de forma expícita
	*/
	public void init(byte[] chave){
		System.out.println("\\nIniciou o AES256 com chave: " + chave + "\n");
	};
	/*
	* Método que faz a cifragem de message usando a chave fornecida/gerada
	* por um dos métodos init. Chamar este método sem inicializar o
	* algoritmo através de uma das duas formas indicadas,
	* lança a SecurityException
	*/
	public byte[] doFinal(byte[] message) throws SecurityException{
		return null;
	};
}
