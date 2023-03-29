package pl.kurs.homeworks.lessonenumeratedtype.ex2.models;

import java.util.Arrays;

public enum WizardType {
    WIZARD_OF_FIRE("Mag ognia", new SpellType[]{SpellType.HEAL, SpellType.FIREBALL}),
    WIZARD_OF_WIND("Mag wiatru", new SpellType[]{SpellType.HEAL, SpellType.LIGHTNING_STRIKE});

    private final String description;
    private final SpellType[] spellTypes;

    WizardType(String description, SpellType[] spellTypes) {
        this.description = description;
        this.spellTypes = spellTypes;
    }

    public SpellType[] getSpellTypes() {
        SpellType[] copiedArray = Arrays.copyOf(spellTypes, spellTypes.length);
        return copiedArray;
    }

}
