package AlgoFix;

import AlgoFix.Excepciones.ManoMenorACeroExcepcion;

public class Pintura {
    private String color;
    private int precio;
    private int cantManosPincel;
    private int cantManosRodillo;

    public Pintura(String unColor, int unPrecio, int cantManosPincel, int cantManosRodillo) {
        if(cantManosPincel<=0 || cantManosRodillo<=0){throw  new ManoMenorACeroExcepcion();}
        color = unColor;
        precio = unPrecio;
        this.cantManosPincel = cantManosPincel;
        this.cantManosRodillo = cantManosRodillo;
    }

    public int manosRodillo() {
        return cantManosRodillo;
    }

    public int manosPincel() {
        return cantManosPincel;
    }

    public float calcularCostoMateriales(int metrosCuadrados, Pintor unPintor) {
        return unPintor.calcularCostoMateriales(precio,metrosCuadrados);
    }
}
