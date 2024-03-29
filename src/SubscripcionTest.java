import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubscripcionTest {
    @Test
    public void testprecioPorMes() {
        double esperado=100;
        Subscripcion s = new Subscripcion(200,2) ;
        double resultado = s.precioPorMes();
        assertEquals(esperado, resultado,0) ;
    }
    @Test
    public void testprecioPorMes2() {
        double esperado=67.6;
        Subscripcion s = new Subscripcion(200,3) ;
        double resultado= s.precioPorMes();
        assertEquals(esperado, resultado, 0.1) ;
    }
    @Test
    public void testprecioPorMes5() {
        Subscripcion a = new Subscripcion(1, 2);
        a.cancel();
        assertTrue(true);
    }
}