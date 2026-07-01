package week_1.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("first log message.");
        logger2.log("second log message.");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("Multiple instances of Logger exist.");
        }

        System.out.println("Logger 1 Hashcode:" + logger1.hashCode());
        System.out.println("Logger 2 Hashcode:" + logger2.hashCode());
    }
}
