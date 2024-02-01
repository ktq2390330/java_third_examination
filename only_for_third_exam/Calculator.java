//インポート
import java.util.Scanner;

//抽象クラス
public abstract class Calculator {

    //インスタンス
    protected Scanner scanner;

    //コンストラクタ
    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    
    public void closeScanner() {
        scanner.close();
    }

    abstract void printResult();

    protected void handleException(CalculatorException e) {
        System.out.println("エラー: " + e.getMessage());
    }
}
