class Bike {
     void run() {System.out.println("running");}//add a final the program is Erro
}
class Honda extends Bike {
    final void run() { System.out.println("runnning safely with 100kph"); }
        public static void main(String[] args) {
            Honda obh = new Honda();
            obh.run();
        }
}
