package pl.kurs.homeworks.lessonenumeratedtype.ex2.app;

import pl.kurs.homeworks.lessonenumeratedtype.ex2.models.Wizard;
import pl.kurs.homeworks.lessonenumeratedtype.ex2.models.WizardType;

public class WizardRunner {
    public static void main(String[] args) {
        Wizard saruman = new Wizard("Saruman", 200.0, 1245, WizardType.WIZARD_OF_FIRE);
        Wizard gandalf = new Wizard("Gandalf", 200.0, 2314, WizardType.WIZARD_OF_WIND);

        gandalf.throwSpell("HEAL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);

        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        gandalf.throwSpell("LIGHTNING_STRIKE", saruman);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("HEAL", gandalf);
        gandalf.throwSpell("HEAL", gandalf);
        gandalf.throwSpell("HEAL", gandalf);

        gandalf.throwSpell("HEAL", saruman);
        gandalf.throwSpell("HEAL", saruman);
        gandalf.throwSpell("HEAL", saruman);
        saruman.throwSpell("HEAL", saruman);
        saruman.throwSpell("HEAL", saruman);
        saruman.throwSpell("HEAL", saruman);
        saruman.throwSpell("HEAL", saruman);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);

        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        saruman.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);


        saruman.throwSpell("FIREBALL", gandalf);


    }
}
