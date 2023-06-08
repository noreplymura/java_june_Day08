class Honda {
    final void run() {
        System.out.println("running...");
    }
}
class Honda2 extends Honda {
public static void main(String[] args) {
    new Honda2().run();
}
}