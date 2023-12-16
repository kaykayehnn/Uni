import java.util.ArrayList;
import java.util.Random;

public abstract class Fighter extends Thread {
    String name;
    int dmg;
    int life;
    double as;

    Random random = new Random();

    ArrayList<Fighter> targets;

    public Fighter(String name, int dmg, int life, double as) {
        super();
        this.name = name;
        this.dmg = dmg;
        this.life = life;
        this.as = as;

        this.targets = new ArrayList<>();
    }
}
