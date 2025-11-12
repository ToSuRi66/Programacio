public class Temperature {
    public float fahrenheitTemp = 78.9F;

    public void calculateCelsius(){
        IO.println((fahrenheitTemp - 32) * 5 / 9);
    }
}
