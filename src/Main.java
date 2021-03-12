public class Main {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]); //to use this with a CL argument instead of changing the variable and recompiling
        int weight = Integer.parseInt(args[1]); //to use this with a CL argument instead of changing the variable and recompiling

        BmiService service = new BmiService();
        float index = service.calculate(height, weight);
        System.out.println((int)index);
    }
}