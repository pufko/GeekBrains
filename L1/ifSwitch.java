package L1;

/**
 * Created by mr p on 23.02.2017.
 */
public class ifSwitch {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int grade =5;
        switch (grade){
            case 5:
                System.out.println("3");
            case 3:
                System.out.println("5");
                break;
        }
        }
}
