package org.example.app;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Seller {

    private List<Seller> affiliates;
    private int seniority;

    public List<Seller> getAffiliates() {
        return affiliates;
    }

    public Employee( String name, int seniority, int sells ) {
        super( name, sells );
        this.affiliates = new ArrayList<>();
        this.seniority = seniority;
    }

    public void addAffiliate( Affiliate affiliate ) {
        affiliates.add( affiliate );
    }

    @Override
    protected void calculatePoints() {
        points += 10 * affiliates.size() + 5 * ( sells + seniority );
    }
}
