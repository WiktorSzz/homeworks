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

    public void throwSpell(String spellName, Wizard target) {
        if (spellName == null || spellName.isEmpty()) {
            System.out.println("Proszę wprowadź nazwę zaklęcia.");
        } else if (target == null) {
            System.out.println("Proszę wprowadź nazwę czarodzieja.");
        } else if (this.hp == 0.0) {
            System.out.println("Nie możesz rzucać zaklęć, jeśli jesteś martwy.");
        } else {
            checkSpellKnowledge(spellName, target);

        }
    }

    private void checkSpellKnowledge(String spellName, Wizard target) {
        SpellType spellType = null;
        for (SpellType st : this.wizardType.getSpellTypes()) {
            if (st.name().equalsIgnoreCase(spellName)) {
                spellType = st;
                break;
            }
        }
        if (spellType == null) {
            System.out.println("Nie ma takiego zaklęcia.");
        } else {
            castSpellType(spellType, target);
        }
    }

    private void castSpellType(SpellType spellType, Wizard target) {
        if (target.hp == 0 && spellType.getHpEffect() < 0) {
            System.out.println("Atakowany czarodziej: " + target.name + " jest martwy, nie możesz go zaatakować.");
        } else {
            target.hp += spellType.getHpEffect();
            if (target.hp < 0) {
                target.hp = 0;
            } else if (target.hp > 200) {
                target.hp = 200;
                System.out.println("Nie możesz zwiększyć hp powyżej 200!");
            }
            System.out.println("Czarodziej " + this.name + " rzucił zaklęcie: " + spellType.name() + " na czarodzieja: " + target.name + ". Jego poziom życia wynosi teraz: " + target.hp);
        }
    }

    @Override
    public String toString() {
        return "Wizard{" + "name='" + name + '\'' + ", hp=" + hp + ", wizardType=" + wizardType + '}';
    }
}






