// 三角関数
class TrigonometricOperations extends Calculator implements CalculatorInterface {
    @Override
    public void start() {
        System.out.println("三角関数を実行します");
        System.out.print("角度を度で入力してください: ");
        double angleDegrees = scanner.nextDouble();

        double angleRadians = Math.toRadians(angleDegrees);

        System.out.println("正弦: " + Math.sin(angleRadians));
        System.out.println("余弦: " + Math.cos(angleRadians));
        System.out.println("正接: " + Math.tan(angleRadians));
    }
}