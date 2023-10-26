# Orientacao-a-Objetos-Classes-e-atributos-no-java

Anotações Orientacao a Objetos Classes e atributos no java

                                                           Orientação a Objetos: Classes e atributos

Agenda
.Forma geral
.definição de classes
.Atributos
.Criação de objetos

 Forma geral de uma classe

class NomeDaClasse {

    //variéveis de instância - atributos
    int var1;
    int var2;
    int var3;

    //declaração de métodos
    void metodo1 (int parametros)(
        //corpo do método
   }

   void metodo2 (int parametros){
       //corpo do método
   }

   void metodo3 (int parametros){
       //corpo do método
   }
}


A classe ela tem qualidades que nós chamamos de atributos que na verdade serão as variáveis dessa classe e os métodos que são formas de ações mas nem sempre
são ações, geralmente você vai ver a declaração de objetos sendo a definição de uma entidade e onde a entidade tem características que são os atributos e
pode executar ações que seriam os métodos mas até o final desse modulo você vai perceber que um objeto é muito mais que isso só que por enquanto agora é com
isso que nós vamos lidar com a classe é uma declaração é uma definição de uma entidade de um objeto onde os seus atributos são as suas características.

Carro: atributos

.Cor
.Marca
.Modelo
.Número de passageiros
.Capacidade do tanque de Conbustível
.Consumo de combustível por km

Exemplo um carro quais seriam os atributos quais seriam as caradterísticas carro pode ter, então um carro tem uma cor e uma marca ou modelo e o número de
passageiros nem que seja uma capacidade de passageiros e a capacidade do tanque de combustível e tem um consumo de combustível por quilômetro, como é que
a gente pode traduzir essas informações para uma classe do java?


Definição de classe Carro e seus atributos

class Carro {

    String marca;
    String modelo;
    int numPassageiros; //número de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel: //consumo de combustível por km

}

A gente define uma classe carro que vai ter os seus atributos então a marca, modelo podem ser do tipo String o número de passageiros pode ser do tipo int ou
double a capacidade de combustível a capacidade do tanque de comnustível ela vai ser double vai ser quebrada a cada 40 litros e meio e o consumo de
combustível então pode ser que o carro faça 400 quilomêtros pode ser que o carro faça 250 ponto 6 então é o número double.

Então a gente conssegue traduzir todas essas informações do carro para o código java, partir da especificação da definição do carro eu consigo da vida eu
consigo criar objetos similares.
esse código que está em baixo é horrível e você não vai ver uma coisa dessas num projeto java no mundo real, ams nós vamos aprender um pouco mais pra frente
como é que a gente pode deixar esse código bonito.
Então como nós vamos sitar valores para os nossos atributos e objetos é o nome da variável ponto o nome do atributo, da mesma forma que temos um Fiat nós
podemos ter um fuscar também só o que vai mudar são os valores que cada objeto tem.

Criação dos objetos

Carro van = new Carro();
van.marca = "Fiat";
van.modelo = "Ducato";
van.numPassageiros = 10;
van.capCombustivel = 100;
van.consumoCombustivel = 0.2;


package com.madu.poo.classes.e.atributos;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
}


Ex:

package com.madu.poo.classes.e.atributos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}


Console:
Fiat
Ducato
Volkswagen
Fusca
