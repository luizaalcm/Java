public class ExemploCarro{
    public static void main(String[] args){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2023;

        //carro.ligar();
        carro1.ligardiferente();

        carro2.marca = "Honda";
        carro2.modelo = "CRV";
        carro2.ano = 2024;

        carro2.ligardiferente();

    }
}