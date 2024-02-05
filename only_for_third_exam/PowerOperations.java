// 累乗計算を行うクラス
public class PowerOperations extends Calculator implements CalculatorInterface{
    // 計算結果を保持する変数
    private double result;

    // 結果を表示するメソッド
    @Override
    public void printResult(){
        System.out.println("結果: "+result);
    }

    // 累乗計算の開始メソッド
    @Override
    public void start(){
        System.out.println("累乗を計算します");
        System.out.print("底を入力してください: ");
        double base=scanner.nextDouble();
        System.out.print("指数を入力してください: ");
        double exponent=scanner.nextDouble();

        // 累乗を計算
        result=Math.pow(base, exponent);

        // 結果を表示
        printResult();
    }
}