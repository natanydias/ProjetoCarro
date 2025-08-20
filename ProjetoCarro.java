public class ProjetoCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2018;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2020;

        carro1.marca = "Ford";
        carro1.modelo = "Focus";
        carro1.ano = 2019;

        System.out.println("Informações do carro 1 (modificado):");
        carro1.mostrarInformacoes();

        System.out.println();

        carro1.ligar();
        carro2.ligar();
    }
}
