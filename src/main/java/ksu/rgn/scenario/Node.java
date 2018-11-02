package ksu.rgn.scenario;

import javax.persistence.*;

/**
 *
 */


@Entity
@Table(name="node")
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ID;

    @ManyToOne
    public MapLocation location;

    @Column(nullable = false)
    public int demand; // In kg
    @Column(nullable = false)
    public int supply; // In kg


    @Override
    public String toString() {
        return String.format("Node #%d { demand = %d, location = %s }", ID, demand, location.toString());
    }
}

