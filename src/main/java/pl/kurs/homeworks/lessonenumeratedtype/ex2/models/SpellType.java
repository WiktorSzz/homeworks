package pl.kurs.homeworks.lessonenumeratedtype.ex2.models;

import java.util.Random;

public enum SpellType {
    HEAL("Leczenie", 30, 50),
    FIREBALL("Kula ognia", -25, -40),
    LIGHTNING_STRIKE("Rażenie piorunem", -20, -40),
    SHIT_STORM("Rażenie gófnem xd", 0, -150){
        @Override
        public double getHpEffect() {
            return new Random().nextBoolean() ? getHpEffectMin() : getHpEffectMax();
        }
    };


    private final String description;
    private final double hpEffectMin;
    private final double hpEffectMax;

    SpellType(String description, int hpEffectMin, int hpEffectMax) {
        this.description = description;
        this.hpEffectMin = hpEffectMin;
        this.hpEffectMax = hpEffectMax;
    }

    public String getDescription() {
        return description;
    }

    public double getHpEffectMin() {
        return hpEffectMin;
    }

    public double getHpEffectMax() {
        return hpEffectMax;
    }

    public double getHpEffect() {
        return getRandomHpEffect();
    }

    private double getRandomHpEffect() {
        double damageRange = hpEffectMax - hpEffectMin;
        double randomDamage = (hpEffectMin + damageRange * Math.random());
        return randomDamage;
    }
}
    //żeby gra była ciekawsza, to zaklęcia muszą posiadać zakres zadawanych obrażeń/leczenia i obrażenia muszą być losowane przez jak
