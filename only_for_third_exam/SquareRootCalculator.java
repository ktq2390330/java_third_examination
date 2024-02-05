//平方根計算を行うクラス
public class SquareRootCalculator extends Calculator implements CalculatorInterface{
    // 計算結果を保持する変数
    private double squareRoot;

    // 結果を表示するメソッド
    @Override
    public void printResult(){
        System.out.println("結果: "+squareRoot);
    }

    // 平方根計算の開始メソッド
    @Override
    public void start(){
        System.out.println("平方根を計算します");
        System.out.println("数値を入力してください:");
        double number=scanner.nextDouble();

        // 数値が非負であるか判定
        if(number<0){
            handleException(new CalculatorException("無効な入力です。非負の数を入力してください。"));
            return; // エラーが発生したら直ちにメソッドを終了
        }

        // 平方根を計算
        squareRoot=Math.sqrt(number);

        // 結果を表示
        printResult();
    }
}