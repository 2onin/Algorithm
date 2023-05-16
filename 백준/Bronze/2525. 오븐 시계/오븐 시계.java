import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //B+C<60 이면 B에 C를 더해준다.
        // B+C > 60이면
        // A에 B+C를 60으로 나눈 몫을 더해준다.
        // B에 B+C를 60으로 나눈 나머지를 더해준다.
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (B + C < 60) {
            B += C;
        } else {
            A += (B + C) / 60;
            B = (B + C) % 60;
            if (A >= 24) {
                A %= 24;
            }
        }
        System.out.print(A + " ");
        System.out.print(B);

    }
}
