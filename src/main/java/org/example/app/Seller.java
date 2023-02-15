package org.example.app;

import static org.example.app.Category.*;

public abstract class Seller {

    protected String name;
    protected int points;
    protected Category category;
    protected int sells;

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }

    public Category getCategory() {
        return category;
    }

    public int getSells() {
        return sells;
    }

    public Seller( String name, int sells ) {
        this.name = name;
        this.points = 0;
        this.category = NEWBIE;
        this.sells = sells;
    }

    public void displayInfo() {
        calculatePoints();
        recategorize();
        displayData();
    }

    protected abstract void calculatePoints();

    private void recategorize() {
        if ( points < 20 ) category = NEWBIE;
        if ( points >= 20 && points <= 30 ) category = APPRENTICE;
        if ( points >= 31 && points <= 40 ) category = SEMI_SENIOR;
        if ( points > 40 ) category = SENIOR;
    }

    private void displayData() {
        System.out.println( "Name: " + name );
        System.out.println( "Points: " + points );
        System.out.println( "Category: " + category.toString() );
    }

    public void sell() {
        sells++;
    }
}
