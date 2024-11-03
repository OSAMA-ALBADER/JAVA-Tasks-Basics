public class Array {
    public static void main(String[] args) {
        int[] weatherTemperature ={15, -4, 50, 23, 31 };

        weatherTemperature[2]=-2;

        for(int temp: weatherTemperature ){
            System.out.println(temp);
        }
    }
}
