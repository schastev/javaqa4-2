public class BmiService {
    public float calculate(int height, int weight) {
        int temp = (int)Math.pow(height, 2);
        float index = 10000 * weight / temp; //the BMI requires the height to be in meters, so we cpmpensate for ours being in centimeters by multiplying by 10^2 (bc height is squared)
        return index;
    }
}
