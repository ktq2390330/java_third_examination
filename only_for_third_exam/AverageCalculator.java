//平均
public class AverageCalculator extends Calculator implements CalculatorInterface {
    double average;
    
    @Override
    void printResult() {
        System.out.println("結果: " + average);
    }

    @Override
    public void start() {
        System.out.println("平均を計算します");
        System.out.println("数値を入力してください (スペースで区切って複数入力可):");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        double sum = 0;

        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }

        average = sum / numbers.length;

        printResult();
    }
}