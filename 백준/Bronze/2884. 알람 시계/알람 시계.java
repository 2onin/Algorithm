import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //M이 45보다 작으면 H는 -1한다. 그리고 M은 60 - (45- M)
        //M이 45보다 크면 H는 그대로 출력, M은 M에서-45 출력
        //H가 0보다 작아지면, H2에 0을 넣어준다.
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M <45){
             H -= 1;
             M = 60 - (45-M);
        } else if(M >= 45){
             M -= 45;
        }
        if(H<0){
            H = 23;
        }
        System.out.println(H);
        System.out.println(M);
    }
}
