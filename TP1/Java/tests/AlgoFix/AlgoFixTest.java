package AlgoFix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoFixTest {

    @Test
    public void testPresupuestoPintorUtilizaPincelConPinturaAlbaOfreceElMenorPresupuesto(){

        AlgoFix algoFix = new AlgoFix();

        algoFix.registrarPintorDePincel("Diego",500);

        Pintura alba = algoFix.crearPintura("Alba",200,1,1);

        Presupuesto presupuesto = algoFix.calcularPresupuestoMasBarato(5,alba);

        // (5 "M2" * 2 "horas" * 500 "Precio" * 1 "manos") + (5 "M2" * 4 "litros" * 200 "Precio" * 1 "manos")
        float valorEsperado = 5 * 2 * 500 + 5 * 4 * 200;

        assertEquals(valorEsperado,presupuesto.valor());
    }


    @Test
    public void testPresupuestoPintoresConPincelUtilizanDiferentesPinturasHacenDescuendoDel50PorcientoEnMoCuandoM2EsMayor40EntoncesOfreceElMenorPresupuesto(){

        AlgoFix algoFix = new AlgoFix();

        algoFix.registrarPintorDePincel("Pablo", 500);
        algoFix.registrarPintorDePincel("Eugenio", 600);
        algoFix.registrarPintorDeRodillo("Tomas", 4000);

        Pintura venier = algoFix.crearPintura("Venier",150,2,1);

        Presupuesto presupuesto =algoFix.calcularPresupuestoMasBarato(55,venier);

        assertEquals("Pablo",presupuesto.responsable());
        assertEquals(121000,presupuesto.valor());
    }

    @Test
    public void testPresupuestoPintoresUtilizandoRodilloConPinturaAlbaOfreceElMenorPresupuesto() {

        AlgoFix algoFix = new AlgoFix();

        algoFix.registrarPintorDeRodillo("Diego",200);
        algoFix.registrarPintorDeRodillo("Eugenio", 130);

        Pintura alba = algoFix.crearPintura("Alba",20,1,1);

        Presupuesto presupuesto = algoFix.calcularPresupuestoMasBarato(5, alba);

        assertEquals("Eugenio",presupuesto.responsable());
        assertEquals(1150,presupuesto.valor());
    }
}
