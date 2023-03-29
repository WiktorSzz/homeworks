package pl.kurs.homeworks.lessonenumeratedtype.ex2.models;

public class Wizard {
    private String name;
    private double hp = 200;
    private long age;
    private WizardType wizardType;

    public Wizard(String name, long age, WizardType wizardType) {
        this.name = name;
        this.age = age;
        this.wizardType = wizardType;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void throwSpell(String spellName, Wizard target) {
        if (spellName == null || spellName.isEmpty()) {
            System.out.println("Proszę wprowadź nazwę zaklęcia.");
            return;
        }
        if (target == null) {
            System.out.println("Proszę wprowadź nazwę czarodzieja.");
            return;
        }
        if (this.hp == 0.0) {
            System.out.println("Nie możesz rzucać zaklęć, jeśli jesteś martwy.");
            return;
        }

        castSpell(spellName, target);
    }

    private void castSpell(String spellName, Wizard target) {
        SpellType spellType = null;
        for (SpellType st : this.wizardType.getSpellTypes()) {
            if (st.name().equalsIgnoreCase(spellName)) {
                spellType = st;
                break;
            }
        }

        if (spellType == null) {
            System.out.println("Nie ma takiego zaklęcia.");
            return;
        }

        if (spellType.getHpEffect() < 0) {
            if (target.getHp() == 0) {
                System.out.println("Atakowany czarodziej: " + target.getName() + " jest martwy, nie możesz go zaatakować.");
            } else if (target.getHp() <= spellType.getHpEffect()) {
                target.setHp(0.0);
                System.out.println("Atakowany czarodziej: " + target.getName() + " umiera.");
            } else {
                double newHealth = target.getHp() + spellType.getHpEffect();
                if (newHealth > 200) {
                    newHealth = 200;
                }
                target.setHp(newHealth);
                System.out.println("Czarodziej " + this.name + " rzucił zaklęcie: " + spellType.name() + " na czarodzieja: " + target.getName() + ". " + "Jego poziom życia wynosi teraz: " + target.getHp());
            }

        } else {
            if (target.getHp() >= 200) {
                System.out.println("Nie możesz zwiększyć hp powyżej 200!");
            } else {
                double newHealth = target.getHp() + spellType.getHpEffect();
                if (newHealth > 200) {
                    newHealth = 200;
                }
                target.setHp(newHealth);
                System.out.println("Czarodziej " + this.name + " uzdrowił czarodzieja: " + target.getName() + ". " + "Jego poziom życia wynosi teraz: " + target.getHp());
            }
        }
    }
}













