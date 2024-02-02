//エラー出力用クラス
public class CalculatorException extends Exception{
    // コンストラクタ
    public CalculatorException(String message){
        // 親クラスのコンストラクタを呼び出してメッセージを設定
        super(message);
    }
}