// 対数計算を行うクラス
class LogarithmicOperations extends Calculator implements CalculatorInterface{
    // 結果を保持する変数
    private double naturalLog;

    // 結果を表示するメソッド
    @Override
    public void printResult(){
        System.out.println("自然対数: "+naturalLog);
    }

    // 対数計算の開始メソッド
    @Override
    public void start(){
        System.out.println("対数を計算します");
        System.out.print("数値を入力してください: ");
        double number=scanner.nextDouble();

        // 自然対数を計算
        naturalLog=Math.log(number);

        // 結果を表示
        printResult();
    }
}