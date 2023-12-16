public class Boss extends Fighter {
    private double massDamageChange;

    public Boss(String name, int dmg, int life, double as, double massDamageChange) {
        super(name, dmg, life, as);

        this.massDamageChange = massDamageChange;
    }

    @Override
    public void run() {
        for (int i = 0; i < targets.size(); i++) {
            Fighter target = targets.get(i);
            while (life > 0 && target.life > 0) {
                boolean isMassAttack = random.nextDouble() < massDamageChange;
                if(isMassAttack) {
                    for (int j = i; j < targets.size(); j++) {
                        target.life -= dmg;
                    }

                    System.out.println(name + " just hit EVERYONE with " + dmg + " damage");
                } else {
                    target.life -= dmg;

                    System.out.println(name + " just hit  "
                            + target.name + " for " + dmg +
                            " and left it with " + target.life);
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
