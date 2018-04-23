package javatpoint.object_class;

class Counter {
    int count = 0;

    public Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

class Counter2 {
    static int count = 0;

    public Counter2() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}

