package Lektion14;

public class KugelVolumen {
        public static double berechneKugelvolumen(double radius)
        {
            if (radius < 0) {
            throw new IllegalArgumentException("Radius must be non-negative");
            }
            return (double)4/3*Math.PI*radius*radius*radius;
        }

}
