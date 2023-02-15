package org.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.app.Category.SENIOR;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setup() {
        this.employee = new Employee( "Mechi", 1, 10 );
    }

    @Test
    @DisplayName( "Should successfully calculate points" )
    void calculatePoints() {
        //Act
        employee.calculatePoints();

        //Assert
        assertThat( employee.getPoints() ).isEqualTo( 55 );
    }

    @Test
    @DisplayName( "Should display info correctly" )
    void displayProperInfo() {
        //Act
        employee.displayInfo();

        //Assert
        assertThat( employee.getPoints() ).isEqualTo( 55 );
        assertThat( employee.getCategory() ).isEqualTo( SENIOR );
        assertThat( employee.getName() ).isEqualTo( "Mechi" );
        assertThat( employee.getSells() ).isEqualTo( 10 );
    }

    @Test
    @DisplayName( "Should increase sells by 1" )
    void increaseSells() {
        //Act
        employee.sell();

        //Assert
        assertThat( employee.getSells() ).isEqualTo( 11 );
    }

    @Test
    @DisplayName( "Should add affiliates" )
    void addAffiliates() {
        //Act
        employee.addAffiliate( new Affiliate( "Luciano", 1 ) );

        //Assert
        assertThat( employee.getAffiliates().size() ).isEqualTo( 1 );
    }


}