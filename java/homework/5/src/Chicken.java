import java.util.Random;

public class Chicken extends Fighter {
    int mana;
    int magicDmg;
    int magicChanche;
    int armour;

    public Chicken(String name, int dmg, int life, int mana, int magicDmg, int magicChanche, int armour, double as) {
        super(name, dmg, life, as);

        this.mana = mana;
        this.magicDmg = magicDmg;
        this.magicChanche = magicChanche;
        this.armour = armour;
    }


    @Override
    public void run() {
        for (int i = 0; i < targets.size(); i++) {
            Fighter target = targets.get(i);
            while (life > 0 && target.life > 0) {
                target.life -= (dmg - armour);

                System.out.println(name + " just hit "
                        + target.name + " for " + (dmg - armour) +
                        " and left it with " + target.life);

                if (mana > 15 && random.nextInt(100) <= magicChanche) {
                    mana -= 15;
                    target.life -= magicDmg;
                    System.out.println(name + " made magic dmg "
                            + " and left " + target.name +
                            " with " + target.life + " hp.");
                } else {
                    mana += mana * 0.1;
                }

                try {
                    Thread.sleep((long) (1000 / as));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (life > 0) {
                System.out.println(name + ":HAHAHAH you will make "
                        + "great chicken nugets!");
            } else {
                System.out.println(name + ":Cheater!!!!!!!!!!!!");
                return;
            }
        }
    }
}
