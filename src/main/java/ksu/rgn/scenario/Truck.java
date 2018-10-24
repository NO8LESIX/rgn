package ksu.rgn.scenario;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name="truck")
public final class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ID;


    public Node startingNode, endingNode;

    @Column(nullable = false)
    public int capacity; // in kg

    @Column(nullable = false)
    public boolean refrigerated;


    @Override
    public String toString() {
        return String.format("Truck #%d { capacity = %d }", ID, capacity);
    }
}
