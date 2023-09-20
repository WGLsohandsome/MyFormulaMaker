import java.io.IOException;
import java.util.Scanner;

public class MyFormulaMaker {

    private static Scanner scanner;
    private static Build build = new Build();
    private static Check check = new Check();
    public static void main(String[] args) throws IOException {
        while(true) {
            Scanner scanner1;
            System.out.println("请输入: 1或2 (1.生成算式;2.校对答案)");
            scanner = new Scanner(System.in);
            String what = scanner.nextLine();
            if(what.equals("1")) {
                build.build();
                System.out.println("是否结束: YES or NO");
                scanner1 = new Scanner(System.in);
                String exit = scanner1.nextLine();
                if(exit.equals("YES")) {
                    break;
                }
            }else if(what.equals("2")) {
//                new CorrectandWrong();
                check.orrectandWrong();
                System.out.println("是否结束: YES or NO");
                scanner1 = new Scanner(System.in);
                String exit = scanner1.nextLine();
                if(exit.equals("YES")) {
                    break;
                }
            }else {
                throw new IOException();
            }
        }
    }
}
