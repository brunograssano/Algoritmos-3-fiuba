package AlgoFix;

import AlgoFix.Excepciones.AreaNegativaExcepcion;

public class Pincel extends Herramienta{

    static int tiempoEnPintarMetroCuadrado = 2;

    public Pincel(int unPrecioPorHora) {
        precioPorHora = unPrecioPorHora;
        litrosParaPintarMetroCuadrado = 4;
    }

    @Override
    int manosNecesariasParaPintura(Pintura unaPintura) {
        return unaPintura.manosPincel();
    }

    @Override
    float calcularCostoManoDeObra(int metrosCuadrados) {
        if(metrosCuadrados < 0) { throw new AreaNegativaExcepcion();}
        float descuento = 1;
        if(metrosCuadrados > 40){
            descuento = (float) 0.5;
        }
        return precioPorHora * metrosCuadrados * tiempoEnPintarMetroCuadrado * descuento;
    }
}
