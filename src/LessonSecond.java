import java.util.Scanner;

public class LessonSecond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение что вы хотите сделать :\n1-напечатем какуюто цифру или букву или символ сколько то раз\n" +
                "увеличение на один\n2-счетчик\n0-выход");
        int a = scan.nextInt();
        while (true) {
            if (a == 1) {
                System.out.println("Выбирите цифрой .Что хотите повторить :\n1-число\n2-строку\n3-char элемент\n0-выход");
                int Сhoice = scan.nextInt();
                if (Сhoice == 1) {
                    MultiplierInt();
                } else if (Сhoice == 2) {
                    MultiplierString();
                } else if (Сhoice == 3) {
                    MultiplierChar();
                } else {
                    break;
                }
            } else if (a == 2) {
                System.out.println("Первое число");
                int NumberFirst = scan.nextInt();
                System.out.println("Второе число");
                int NumberSecond = scan.nextInt();

                System.out.println(SumOfAllNumbers(NumberFirst ,NumberSecond));
            } else if (a == 0) {
                break;
            }
        }

    }

    public static void MultiplierInt() {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        System.out.println("Введите на сколько вы хотите повторить число ");
        int Increase = scan.nextInt();
        for (int e = 1; e <= Increase; e++) {
            System.out.println(number + " ");
        }
    }

    public static void MultiplierString() {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Строку");
        String s = sc.nextLine();
        System.out.println("Введите на сколько вы хотите повторить строку");
        int Increase = scan.nextInt();
        for (int e = 1; e <= Increase; e++) {
            System.out.println(s + " ");
        }
    }

    public static void MultiplierChar() {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Строку");
        String s = sc.nextLine();
        System.out.println("Введите на сколько вы хотите повторить элемент");
        int Increase = scan.nextInt();
        for (int e = 1; e <= Increase; e++) {
            System.out.println(s + " ");
        }
    }

    public static int SumOfAllNumbers(int NumberFirst ,int NumberSecond) {
        int s = 0;
            s = NumberFirst + NumberSecond;
        return s;
    }
}

