package easy;

import java.util.Arrays;

public class $2469ConverttheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] result= new double[2];
        result[0] = celsius+273.15;
        result[1] = celsius*1.80+32.00;
        return result;
    }

    public static void main(String[] args) {
        double[] doubles = new $2469ConverttheTemperature().convertTemperature(36.50);
        System.out.println(Arrays.toString(doubles));
    }
}
