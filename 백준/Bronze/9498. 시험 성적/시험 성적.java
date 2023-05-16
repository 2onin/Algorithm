import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(90<=A){
            System.out.println("A");
        } else if (80<=A && A < 90) {
            System.out.println("B");
        } else if(70<=A && A<80){
            System.out.println("C");
        } else if(60<=A && A<70){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
