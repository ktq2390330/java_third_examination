//インポート
import java.util.Scanner;

//抽象クラス
public abstract class Calculator{

    //スキャナーのインスタンス
    protected Scanner scanner;

    //コンストラクタ
    public Calculator(){
        //スキャナーの初期化
        this.scanner=new Scanner(System.in);
    }

    //スキャナーをクローズするメソッド
    public void closeScanner(){
        scanner.close();
    }

    //結果を表示する抽象メソッド
    abstract void printResult();

    //例外処理をハンドリングするメソッド
    protected void handleException(CalculatorException e){
        System.out.println("エラー: "+e.getMessage());
    }
}
