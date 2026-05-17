import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorUnidadesTest{
    
    private final ConversorUnidades conversor = new ConversorUnidades();
    @Test
    public void deberiaConvertirMetrosACentimetros(){
        assertEquals(200.0, conversor.metrosACentimetros(2.0));
    }
    @Test
    public void deberiaRetornarCeroSiElInputEsCero() {
        assertEquals(0.0, conversor.metrosACentimetros(0.0));
    }
    @Test
    public void deberiaConvertirMetrosAMilimetros(){
        assertEquals(2000.0, conversor.metrosAMilimetros(2.0));
    }
    @Test
    public void deberiaRetornarCeroEnMilimetrosSiElInputEsCero(){
        assertEquals(0.0, conversor.metrosAMilimetros(0.0));
    }
    @Test
    public void deberiaConvertirCentimetrosAMetros(){
        assertEquals(1.0, conversor.centimetrosAMetros(100.0));
    }

    @Test
    public void deberiaRetornarCeroEnMetrosSiCentimetrosEsCero(){
        assertEquals(0.0, conversor.centimetrosAMetros(0.0));
    }
    @Test 
    public void deberiaConvertirCentimetrosAMilimetros(){
        assertEquals(20.0, conversor.centimetrosAMilimetros(2.0));
    }
}