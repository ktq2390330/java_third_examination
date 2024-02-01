//インポート
import java.util.Scanner;

//親クラス
public class Calculator {

    //インスタンス
    protected Scanner scanner;

    //コンストラクタ
    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    
    public void closeScanner() {
        scanner.close();
    }

    protected void handleException(CalculatorException e) {
        System.out.println("エラー: " + e.getMessage());
    }
}
