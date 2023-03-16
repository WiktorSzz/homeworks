package pl.kurs.homeworks.lessonenumeratedtype.ex2.models;

public class Wizard {
    private String name;
    private double hp;
    private long age;
    private WizardType wizardType;

    public Wizard(String name, double hp, long age, WizardType wizardType) {
        this.name = name;
        this.hp = 200.0;
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
        SpellType spellType = getSpellType(spellName);

        if (spellName == null || spellName.isEmpty()) {
            System.out.println("Proszę wprowadź nazwę zaklęcia!");
            return;
        }
        if (target == null) {
            System.out.println("Proszę wprowadź nazwę czarodzieja.");
            return;
        }

        if (this.hp == 0.0) {
            System.out.println("Nie możesz rzucać zaklęć " + this.getName() + ", jesteś martwy!");
            return;
        }

        if (spellType == null) {
            System.out.println("Nie znaleziono takiego zaklęcia!");
            return;
        }

        if (spellType == SpellType.HEAL) {
            castHealSpell(target);
        } else if (spellType == SpellType.FIREBALL) {
            castFireballSpell(target);
        } else if (spellType == SpellType.LIGHTNING_STRIKE) {
            castLightningStrikeSpell(target);
        }
    }

    private SpellType getSpellType(String spellName) {
        for (SpellType spellType : this.wizardType.getSpellTypes()) {
            if (spellType.name().equals(spellName)) {
                return spellType;
            }
        }
        return null;
    }

    private void castHealSpell(Wizard target) {
        if (target.getHp() >= 200) {
            System.out.println("Nie możesz zwiększyć hp powyżej 200!");
        }else if (target.getHp() >= 171) {
            target.setHp(200);
            System.out.println("Uzdrowiłeś się " + target.getName() + "!" + " Twój poziom życia wynosi: " + this.getHp());
        } else if (this == target) {
            this.setHp(getHp() + 30);
            System.out.println("Uzdrowiłeś się " + target.getName() + "!" + " Twój poziom życia wynosi: " + this.getHp());
        } else {
            if (target.getHp() >= 171) {
                System.out.println("Nie możesz zwiększyć hp powyżej 200!");
            } else {
                target.setHp(target.getHp() + 30);
                System.out.println("Czarodziej " + this.name + " uzdrowił czarodzieja: " + target.getName() + ". " + "Jego poziom życia wynosi teraz: " + target.getHp());
            }
        }
    }

    private void castFireballSpell(Wizard target) {
        if (target.getHp() == 0){
            System.out.println("Atakowany czarodziej: " + target.getName() + " jest martwy, nie możesz go zaatakować.");
        }
        else if (target.getHp() <= 24) {
            target.setHp(0);
            System.out.println("Atakowany czarodziej: " + target.getName() + " umiera.");
        } else {
            double newHealth = target.getHp() - 25;
            target.setHp(newHealth);
            System.out.println("Czarodziej " + this.name + " rzucił zaklęcie: " + SpellType.FIREBALL.getDescription() + " na czarodzieja: " + target.getName() + ". " + "Jego poziom życia wynosi teraz: " + target.getHp());
        }
    }

    private void castLightningStrikeSpell(Wizard target) {
        if (target.getHp() == 0){
            System.out.println("Atakowany czarodziej: " + target.getName() + " jest martwy, nie możesz go zaatakować.");
        }
        else if (target.getHp() <= 19) {
            target.setHp(0);
            System.out.println("Atakowany czarodziej: " + target.getName() + " umiera.");
        } else {
            double newHealth = target.getHp() - 20;
            target.setHp(newHealth);
            System.out.println("Czarodziej " + this.name + " rzucił zaklęcie: " + SpellType.LIGHTNING_STRIKE.getDescription() + " na czarodzieja: " + target.getName() + ". " + "Jego poziom życia wynosi teraz: " + target.getHp());
        }
    }

}










