package one.digitalinnovation.gof.factory;

public class FabricaVeiculos {
    public static Veiculo criarVeiculo(String tipo){
        if("carro".equalsIgnoreCase(tipo)){
            return new Carro();
        } else if ("moto".equalsIgnoreCase(tipo)) {
            return new Moto();
        } else throw new RuntimeException("Tipo de veículo desconhecido" + tipo);
    }
}
