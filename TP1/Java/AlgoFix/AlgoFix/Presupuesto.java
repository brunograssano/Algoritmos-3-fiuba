package AlgoFix;

import AlgoFix.Excepciones.NoHayPintoresRegistradosExcepcion;
import AlgoFix.Excepciones.PintorSinCrearExcepcion;
import AlgoFix.Excepciones.PinturaSinCrearExcepcion;

import java.util.ArrayList;

public class Presupuesto {

    private Pintor responsable;
    private float valorTotal;

    public void calcularMasBarato(int metrosCuadrados, Pintura unaPintura, ArrayList<Pintor> pintores) {
        if(pintores.isEmpty()){throw new NoHayPintoresRegistradosExcepcion();}
        float presupuestoDePintor,presupuestoMasBarato=Float.MAX_VALUE;

        for (Pintor pintor:pintores){
            presupuestoDePintor = calcularPresupuestoParaPintor(pintor,metrosCuadrados,unaPintura);
            if(presupuestoDePintor<presupuestoMasBarato){
                responsable = pintor;
                presupuestoMasBarato = presupuestoDePintor;
            }
        }
        valorTotal = presupuestoMasBarato;

    }

    private float calcularPresupuestoParaPintor(Pintor unPintor, int metrosCuadrados, Pintura unaPintura){
        if(unaPintura == null){ throw new PinturaSinCrearExcepcion();}
        if(unPintor == null){ throw new PintorSinCrearExcepcion();}

        float costoTotal = 0;
        costoTotal += unPintor.calcularCostoManoDeObra(metrosCuadrados);
        costoTotal += unaPintura.calcularCostoMateriales(metrosCuadrados,unPintor);
        return costoTotal * unPintor.manosNecesariasConPintura(unaPintura);
    }

    public String responsable(){
        return responsable.obtenerNombre();
    }

    public float valor(){
        return valorTotal;
    }
}
