// 四則演算
public class ArithmeticOperations extends Calculator implements CalculatorInterface {

    double result;

    @Override
    void printResult(){
        System.out.println("商: "+result);
    }

    @Override
    public void start(){
        System.out.println("四則演算を実行します");
        System.out.print("最初の数を入力してください: ");
        double num1=scanner.nextDouble();
        System.out.print("次の数を入力してください: ");
        double num2=scanner.nextDouble();

        System.out.println("合計: "+(num1+num2));
        System.out.println("差: "+(num1-num2));
        System.out.println("積: "+(num1*num2));

        

        if(num2 != 0){
            result=num1/num2;
            printResult();
        }else{handleException(new CalculatorException("0で割ることはできません。"));}
    }
}