
public class r {

	public static void main(String[] args) {

		int a = 10;
        double b = 3.14;
        String text = "Hello";

        // �� �ٲ� ���� ������ ������ ���
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(text);

        // �Ǵ� System.out.print �޼��忡 ���� ���� �����Ͽ� �� ���� ���
        System.out.print(a + " " + b + " " + text);

        // ���� ������ ����� ����Ͽ� ������ ������ ���
        System.out.printf("%d %.2f %s", a, b, text);
    }
}