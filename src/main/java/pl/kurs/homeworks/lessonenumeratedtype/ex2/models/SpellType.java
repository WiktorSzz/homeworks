package pl.kurs.homeworks.lessonenumeratedtype.ex2.models;

public enum SpellType {
    HEAL("Leczenie", 30.0), FIREBALL("Kula ognia", -25.0), LIGHTNING_STRIKE("Rażenie piorunem", -20.0);

    private final String description;
    private final double hpEffect;

    SpellType(String description, double hpEffect) {
        this.description = description;
        this.hpEffect = hpEffect;
    }

    public String getDescription() {
        return description;
    }

}
