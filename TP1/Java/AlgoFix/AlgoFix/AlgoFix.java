package AlgoFix;
import java.util.*;

public class AlgoFix {

    private ArrayList<Pintor> pintores;

    public AlgoFix(){
        pintores = new ArrayList<Pintor>();
    }

    public Pintura crearPintura(String unColor, int unPrecio, int cantManosPincel, int cantManosRodillo){
        return new Pintura(unColor,unPrecio,cantManosPincel,cantManosRodillo);
    }

    private void registrarPintor(String unNombre,Herramienta herramienta){
        pintores.add(new Pintor(unNombre,herramienta));
    }

    public void registrarPintorDePincel(String unNombre,int unPrecioPorHora){
        registrarPintor(unNombre,new Pincel(unPrecioPorHora));
    }

    public void registrarPintorDeRodillo(String unNombre,int unPrecioPorHora){
        registrarPintor(unNombre,new Rodillo(unPrecioPorHora));
    }

    public Presupuesto calcularPresupuestoMasBarato(int metrosCuadrados,Pintura unaPintura){
        Presupuesto presupuesto = new Presupuesto();
        presupuesto.calcularMasBarato(metrosCuadrados,unaPintura,pintores);
        return presupuesto;
    }


}
