
public class r {

	public static void main(String[] args) {

		int a = 10;
        double b = 3.14;
        String text = "Hello";

        // 줄 바꿈 없이 값들을 옆으로 출력
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(text);

        // 또는 System.out.print 메서드에 여러 값을 전달하여 한 번에 출력
        System.out.print(a + " " + b + " " + text);

        // 형식 지정된 출력을 사용하여 값들을 옆으로 출력
        System.out.printf("%d %.2f %s", a, b, text);
    }
}