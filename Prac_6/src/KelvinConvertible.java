public class KelvinConvertible implements Convertible {
    @Override
    public float convertFromC(float c) {
        return (float) (c + 273.15);
    }

    @Override
    public float convertToC(float k) {
        return (float) (k - 273.15);
    }
}
