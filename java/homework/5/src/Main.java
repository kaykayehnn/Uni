public class Main {

    public static void main(String[] args) {
        Boss b = new Boss("Professor Golev", 50, 2000, 2, 0.3);
        Chicken c1 = new Chicken("Pesho", 20, 300, 90, 30, 40, 5, 4);
        Chicken c2 = new Chicken("Gosho", 30, 700, 30, 10, 10, 10, 2);
        Chicken c3 = new Chicken("Na Gosho tatko mu", 30, 700, 30, 10, 10, 10, 2);
        Chicken c4 = new Chicken("Na Gosho mamata", 30, 700, 30, 10, 10, 10, 2);
        Chicken c5 = new Chicken("Na Pesho brata", 30, 700, 30, 10, 10, 10, 2);

        c1.targets.add(b);
        c2.targets.add(b);
        c3.targets.add(b);
        c4.targets.add(b);
        c5.targets.add(b);

        b.targets.add(c1);
        b.targets.add(c2);
        b.targets.add(c3);
        b.targets.add(c4);
        b.targets.add(c5);

        b.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();


    }



}
