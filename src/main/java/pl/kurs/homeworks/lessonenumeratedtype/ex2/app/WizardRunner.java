package pl.kurs.homeworks.lessonenumeratedtype.ex2.app;
import pl.kurs.homeworks.lessonenumeratedtype.ex2.models.Wizard;
import pl.kurs.homeworks.lessonenumeratedtype.ex2.models.WizardType;

public class WizardRunner {
    public static void main(String[] args) {
        Wizard saruman = new Wizard("Saruman",  1245, WizardType.WIZARD_OF_FIRE);
        Wizard gandalf = new Wizard("Gandalf",  2314, WizardType.WIZARD_OF_WIND);

        gandalf.throwSpell("HEAL", gandalf);
        gandalf.throwSpell("FIREBALL", gandalf);
        gandalf.throwSpell("LIGHTNING_STRIKE", gandalf);
        saruman.throwSpell("FIREBALL", saruman);
        saruman.throwSpell("FIREBALL", saruman);
        gandalf.throwSpell("HEAL", saruman);


    }
}
