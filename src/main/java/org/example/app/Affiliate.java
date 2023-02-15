package org.example.app;

public class Affiliate extends Seller {
    public Affiliate( String name, int sells ) {
        super( name, sells );
    }

    @Override
    protected void calculatePoints() {
        points += 15 * sells;
    }
}
