// 対数
class LogarithmicOperations extends Calculator implements CalculatorInterface {
    @Override
    public void start() {
        System.out.println("対数を計算します");
        System.out.print("数値を入力してください: ");
        double number = scanner.nextDouble();

        double naturalLog = Math.log(number);
        System.out.println("自然対数: " + naturalLog);
    }
}