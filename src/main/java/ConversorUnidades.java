public class ConversorUnidades{
    public double metrosACentimetros(double metros) {
        return metros * 100;
    }
    public double metrosAMilimetros(double m){
        return m * 1000;
    }
    public double centimetrosAMetros(double centimetros){
        final double CENTIMETRO_POR_METRO = 100.0;
        return centimetros/CENTIMETRO_POR_METRO;
    }
}