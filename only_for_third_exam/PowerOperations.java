// 累乗
public class PowerOperations extends Calculator implements CalculatorInterface {
    double result;

    @Override
    void printResult() {
        System.out.println("結果: " + result);
    }

    @Override
    public void start() {
        System.out.println("累乗を計算します");
        System.out.print("底を入力してください: ");
        double base = scanner.nextDouble();
        System.out.print("指数を入力してください: ");
        double exponent = scanner.nextDouble();

        result = Math.pow(base, exponent);

        printResult();
    }
}