public class FahrenheitConvertible implements Convertible {

    @Override
    public float convertFromC(float c) {
        return (float) (c * 1.8 + 32);
    }

    @Override
    public float convertToC(float f) {
        return (float) ((f - 32) / 1.8);
    }
}
