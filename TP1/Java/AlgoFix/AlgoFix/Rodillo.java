package AlgoFix;

import AlgoFix.Excepciones.AreaNegativaExcepcion;

public class Rodillo extends Herramienta {

    static int tiempoEnPintarMetroCuadrado = 1;

    public Rodillo(int unPrecioPorHora) {
        precioPorHora = unPrecioPorHora;
        litrosParaPintarMetroCuadrado = 5;
    }

    @Override
    int manosNecesariasParaPintura(Pintura unaPintura) {
        return unaPintura.manosRodillo();
    }

    @Override
    float calcularCostoManoDeObra(int metrosCuadrados) {
        if(metrosCuadrados < 0){throw new AreaNegativaExcepcion();}
        return precioPorHora * metrosCuadrados * tiempoEnPintarMetroCuadrado;
    }
}
