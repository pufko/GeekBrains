package McGrat;

/**
 * Created by mr p on 02.03.2017.
 */
class Option {
    public static void main(String[] args) {
        if (args[0].equals("-en")) {
            System.out.println("English option");
        } else if (args[0].equals("-es")) {
            System.out.println("Spanish option");
        } else System.out.println("Unrecognized option");
    }
}
