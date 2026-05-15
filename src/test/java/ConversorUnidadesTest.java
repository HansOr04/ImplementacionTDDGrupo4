import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorUnidadesTest{
    
    private final ConversorUnidades conversor = new ConversorUnidades();
    @Test
    public void deberiaConvertirMetrosACentimetros(){
        assertEquals(400.0, conversor.metrosACentimetros(2.0));
    }
    @Test
    public void deberiaRetornarCeroSiElInputEsCero() {
        assertEquals(0.0, conversor.metrosACentimetros(0.0));
    }
}