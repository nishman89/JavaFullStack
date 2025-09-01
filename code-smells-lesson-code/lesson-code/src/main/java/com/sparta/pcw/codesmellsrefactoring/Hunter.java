package com.sparta.pcw.codesmellsrefactoring;

public class Hunter extends Person {
    private Shootable shooter;

    public Hunter(String firstName, String lastName, Shootable shooter) {
        super(firstName, lastName, new Address(1, "1", "1"));
        this.shooter = shooter;
    }

    public void setShooter(Shootable shooter)
    {
        this.shooter = shooter;
    }

    public String shootWeapon() {
        return String.format("Hunter %s shoots! %s", getFullName(), shooter.shoot());
    }

}
