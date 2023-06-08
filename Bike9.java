class Bike9 {
    int speedlimit = 90;//using a final method in a error 
    void run() {
        speedlimit = 400;
        System.out.print(speedlimit);
    }
    public static void main(String[] args) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}
