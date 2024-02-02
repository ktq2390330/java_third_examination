//平均を計算するクラス
public class AverageCalculator extends Calculator implements CalculatorInterface {
    //結果を保持する変数
    double average;
    
    //結果を表示するメソッド
    @Override
    void printResult(){
        System.out.println("結果: "+average);
    }

    //平均計算の開始メソッド
    @Override
    public void start(){
        System.out.println("平均を計算します");
        System.out.println("数値を入力してください (スペースで区切って複数入力可):");
        String input=scanner.nextLine();
        String[] numbers=input.split(" ");
        double sum=0;

        //入力された数値の合計を計算
        for(String number:numbers){
            sum+=Double.parseDouble(number);
        }
        //平均を計算
        average=sum/numbers.length;
        //結果を表示
        printResult();
    }
}