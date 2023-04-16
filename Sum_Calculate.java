import java.util.Scanner;
public class Sum_Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Type Of Values");
        String type = sc.nextLine();
        System.out.println("Input total number of values: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid value");
            return;
        }
        // creating a array
        System.out.println("Values are:");
        float[] values = new float[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextFloat();
        }
        float result = calculate(type, values);
        System.out.println("Result: " + result);
    }

    public static float calculate(String type, float[] values) {
        float sum = 0;
        switch (type) {
            case "integer":
                for (float value : values) {
                    sum += (int) value;
                }
                break;
            case "float":
                for (float value : values) {
                    sum += value;
                }
                break;
            default:
                System.out.println("Invalid data type of value");
                break;
        }
        return sum;
    }
}
