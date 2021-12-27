//package homework_woker;

public class Main {
    public static void main(String[] args) {
        Woker.OnTaskDoneListener listener = System.out::println;
        Woker.OnTaskErrorListener error = System.out::println;
        Woker woker = new Woker(listener, error);
        woker.start();
    }
}
