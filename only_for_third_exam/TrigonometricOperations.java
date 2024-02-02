// 三角関数計算を行うクラス
class TrigonometricOperations extends Calculator implements CalculatorInterface{
    // 計算結果を保持する変数
    double angleRadians;

    // 結果を表示するメソッド
    @Override
    void printResult(){
        System.out.println("正弦: "+Math.sin(angleRadians));
        System.out.println("余弦: "+Math.cos(angleRadians));
        System.out.println("正接: "+Math.tan(angleRadians));
    }

    // 三角関数計算の開始メソッド
    @Override
    public void start(){
        System.out.println("三角関数を計算します");
        System.out.print("角度を度で入力してください: ");
        double angleDegrees=scanner.nextDouble();

        // 弧度法に変換
        angleRadians=Math.toRadians(angleDegrees);
        // 結果を表示
        printResult();
    }
}