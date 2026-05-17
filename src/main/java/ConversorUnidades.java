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
    public double centimetrosAMilimetros(double cm){
        return cm * 10;
    }
    public double milimetrosAMetros(double mm){
        final double MILIMETRO_POR_METRO = 1000.0;
        return mm/MILIMETRO_POR_METRO;
    }
}