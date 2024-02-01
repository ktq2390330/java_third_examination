//インポート
import java.util.InputMismatchException;

//Main実行の中身
public class AdvancedCalculator extends Calculator implements CalculatorInterface {

    //インスタンス
    private CalculatorInterface arithmeticOperations;
    private CalculatorInterface powerOperations;
    private CalculatorInterface logarithmicOperations;
    private CalculatorInterface trigonometricOperations;
    private CalculatorInterface averageCalculator;
    private CalculatorInterface squareRootCalculator;
    private CalculatorInterface lastChosenOperation;

    //コンストラクタ
    public AdvancedCalculator() {
        this.arithmeticOperations = new ArithmeticOperations();
        this.powerOperations = new PowerOperations();
        this.logarithmicOperations = new LogarithmicOperations();
        this.trigonometricOperations = new TrigonometricOperations();
        this.averageCalculator = new AverageCalculator();
        this.squareRootCalculator = new SquareRootCalculator();
    }

    //同計算ループの返答用boolean
    private boolean askUserForAnotherCalculation() {
        System.out.print("もう一度同じ計算を行いますか？ (1. はい / 2. メニューに戻る / 3. 終了): ");
        int continueChoice = scanner.nextInt();

        switch (continueChoice) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                System.out.println("電卓プログラムを終了します。");
                closeScanner();
                System.exit(0);
            default:
                System.out.println("無効な選択です。メニューに戻ります。");
                return false;
        }
    }

    
    @Override
    public void start() {

        //メインメニュー
        while (true) {
            try {
                System.out.println("電卓プログラム - 操作を選んでください:");
                System.out.println("1. 四則演算");
                System.out.println("2. 累乗・べき乗");
                System.out.println("3. 対数");
                System.out.println("4. 三角関数");
                System.out.println("5. 平均値計算");
                System.out.println("6. 平方根計算");
                System.out.println("7. 終了");
                System.out.print("整数を入力:");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        lastChosenOperation = arithmeticOperations;
                        break;
                    case 2:
                        lastChosenOperation = powerOperations;
                        break;
                    case 3:
                        lastChosenOperation = logarithmicOperations;
                        break;
                    case 4:
                        lastChosenOperation = trigonometricOperations;
                        break;
                    case 5:
                        lastChosenOperation = averageCalculator;
                        break;
                    case 6:
                        lastChosenOperation = squareRootCalculator;
                        break;
                    case 7:
                        System.out.println("電卓プログラムを終了します。");
                        closeScanner(); // スキャナーを適切にクローズ
                        System.exit(0);
                    default:
                        System.out.println("無効な選択です。再度選んでください。");
                }

                //同計算ループ
                do {
                    lastChosenOperation.start();
                } while (askUserForAnotherCalculation());

            } catch (InputMismatchException e) {
                handleException(new CalculatorException("無効な入力です。整数を入力してください。"));
                scanner.nextLine(); // 不正な入力をクリア
            }
        }
    }
}
