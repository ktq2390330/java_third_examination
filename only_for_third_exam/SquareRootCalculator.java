//平方根
public class SquareRootCalculator extends Calculator implements CalculatorInterface {

    @Override
    public void start() {
        System.out.println("Calculating Square Root");
        System.out.println("数値を入力してください:");
        double number = scanner.nextDouble();

        //数値判定
        if (number < 0) {
            handleException(new CalculatorException("無効な入力です。非負の数を入力してください。"));
            return; // エラーが発生したら直ちにメソッドを終了
        }

        double squareRoot = Math.sqrt(number);
        System.out.println("結果: " + squareRoot);
    }
}