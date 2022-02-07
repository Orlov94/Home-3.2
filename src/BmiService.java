public class BmiService {
    public float calculate(float weight, float growth) {
        float bodyMassIndex = weight / (growth * growth);
        return bodyMassIndex;
    }
}
