package gauß;

public class FastGauß
{
    private static final double arcaneConstant = (1+Math.sqrt(1-2*Math.PI*Math.PI+6*Math.PI))/(2*Math.PI);
    private static final double p0 = Math.sqrt(Math.PI/2);
    private static final double p1 = 1/Math.sqrt(2*Math.PI);
    private static final double p3 = Math.sqrt(2/Math.PI);
    private static final double p4 = p0*p0;
    private static final double p5 = Math.sqrt(2);
    private static final double p7 = 2*Math.PI*arcaneConstant*arcaneConstant;

    public static double getErf(double x)
    {
        if ( x == 0 ) return 0;
        x = p5*x;
        double xSquared = x*x;
        double sdf = Math.exp(-xSquared/2);
        return 1-p3*(p0+(1/x)*(sdf-Math.sqrt(p4*xSquared+(sdf*Math.sqrt(1+p7*xSquared)/(1+arcaneConstant*xSquared)))));
    }
}
