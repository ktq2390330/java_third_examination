// 四則演算
public class ArithmeticOperations extends Calculator implements CalculatorInterface {

    //割り算の結果を保持する変数
    private double result;

    //結果を表示するメソッド
    @Override
    public void printResult(){
        System.out.println("商: "+result);
    }

    //四則演算の開始メソッド
    @Override
    public void start(){
        System.out.println("四則演算を実行します");
        System.out.print("最初の数を入力してください: ");
        double num1=scanner.nextDouble();
        System.out.print("次の数を入力してください: ");
        double num2=scanner.nextDouble();

        //合計、差、積の表示
        System.out.println("合計: "+(num1+num2));
        System.out.println("差: "+(num1-num2));
        System.out.println("積: "+(num1*num2));

        //徐算の場合、0で割り算しないようにチェック
        if(num2 != 0){
            result=num1/num2;
            printResult();

        //0で割り算しようとした場合の例外処理
        }else{handleException(new CalculatorException("0で割ることはできません。"));}
    }
}