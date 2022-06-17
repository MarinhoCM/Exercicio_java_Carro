// @author caua_marinho

/*Implemente uma classe Carro com as seguintes propriedades: um veículo tem um certo
consumo de combustível e uma certa quantidade de combustível no tanque. O consumo
é especificado no construtor e o nível de combustível inicial é 0. Forneça um método
andar que simule o ato de dirigir o veículo por uma certa distância, reduzindo o nível de
combustível no tanque de gasolina, e os métodos obterGasolina, que devolvam o nível
atual de combustível, e adicionarGasolina, para abastecer o tanque.
 
Exemplo de uso:
Carro ferrari = new Carro(5); // Consumo de 5 km/l
ferrari.adicionarGasolina(50); // Abastece 50 litros
ferrari.andar(10); // Anda 10 km
System.out.println("Tanque Ferrari:" + ferrari.obterGasolina());
// Imprime o combustível que resta.
*/
package carro;
public class Carro {
    private double ConsumoDecombustivel;
    private double QuantidadeDeCombustivel;
    
    Carro(Double ConsumoDecombustivel) {
        this.ConsumoDecombustivel = ConsumoDecombustivel;
        this.QuantidadeDeCombustivel = 0.0;
    }
    //metodos
    public void andar(Double km) {
        ConsumoDecombustivel = (km/this.ConsumoDecombustivel);
        this.QuantidadeDeCombustivel -= ConsumoDecombustivel;
    }
     public Double obterGasolina() {
        return QuantidadeDeCombustivel;
    }
    public void adicionarGasolina(Double combustivel) {
        this.QuantidadeDeCombustivel += combustivel;
    }
    
    public static void main(String[] args) {
        System.out.println("Carro: Golf 2020");
        System.out.println("  ");
        Carro Golf = new Carro(10.);//consumo de 10 L/km         
        System.out.println("Combustível: " + Golf.obterGasolina()+" inicialmente");  
        System.out.println("Consumo: " + Golf.ConsumoDecombustivel);          
        System.out.println("Adcionar 60 litros de gasolina!");
        Golf.adicionarGasolina(60.);//abastece 60 litros          
        System.out.println("Combustível: " + Golf.obterGasolina());          
        Golf.andar(80.);//Viaja 80 km          
        System.out.println("Andou 80km!");          
        System.out.println("Combustível: " + Golf.obterGasolina());//combustivel restante
    } 
}