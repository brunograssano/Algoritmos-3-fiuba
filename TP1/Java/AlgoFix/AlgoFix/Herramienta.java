package AlgoFix;

public abstract class Herramienta {
    protected int precioPorHora;
    protected int litrosParaPintarMetroCuadrado;

    int calcularCostoMateriales(int precioPorLitro,int metrosCuadrados){
        return precioPorLitro * metrosCuadrados * litrosParaPintarMetroCuadrado;
    }

    abstract int manosNecesariasParaPintura(Pintura unaPintura);

    abstract float calcularCostoManoDeObra(int metrosCuadrados);
}
