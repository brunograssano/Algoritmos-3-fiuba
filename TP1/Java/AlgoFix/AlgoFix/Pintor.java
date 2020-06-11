package AlgoFix;

public class Pintor {

    private String nombre;
    Herramienta herramienta;
    
    public Pintor(String unNombre, Herramienta herramienta) {
        nombre = unNombre;
        this.herramienta = herramienta;
    }

    public float calcularCostoManoDeObra(int metrosCuadrados){
        return herramienta.calcularCostoManoDeObra(metrosCuadrados);
    }

    public float calcularCostoMateriales(int precioPorLitro, int metrosCuadrados){
        return herramienta.calcularCostoMateriales(precioPorLitro,metrosCuadrados);
    }

    public String obtenerNombre(){
        return nombre;
    }

    public float manosNecesariasConPintura(Pintura unaPintura) {
        return herramienta.manosNecesariasParaPintura(unaPintura);
    }
}
