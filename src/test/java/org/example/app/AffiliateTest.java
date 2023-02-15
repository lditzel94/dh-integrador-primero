package org.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AffiliateTest {
    private Affiliate affiliate;

    @BeforeEach
    void setup() {
        this.affiliate = new Affiliate( "Mechi", 10 );
    }

    @Test
    @DisplayName( "Should successfully calculate points" )
    void calculatePoints() {
        //Act
        affiliate.calculatePoints();

        //Assert
        assertThat( affiliate.getPoints() ).isEqualTo( 150 );
    }
}