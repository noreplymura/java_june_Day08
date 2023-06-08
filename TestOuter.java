class TestOuter {
    static int data = 30;
    static class inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }
    public static void main(String[] args) {
        TestOuter.inner obj = new TestOuter.inner();
        obj.msg();
    }
}
