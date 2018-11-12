package ksu.rgn.db;

import ksu.rgn.scenario.Node;
import ksu.rgn.scenario.Scenario;
import ksu.rgn.scenario.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 */
public class MockDatabase implements DBQueries {

    @Override
    public void open(String url, String dbName, String user, String password) {}

    private final ArrayList<Scenario> scenarios = new ArrayList<>();

    @Override
    public void getAllScenarios(Consumer<List<Scenario>> cb) {
        if (cb != null) cb.accept(scenarios);
    }

    @Override
    public void persistNode(Node n) {

    }

    @Override
    public void persistTruck(Truck t) {

    }

    @Override
    public void persistScenario(Scenario s) {
        if (!scenarios.contains(s)) scenarios.add(s);
    }

    @Override
    public void dropScenario(Scenario s) {

    }

    @Override
    public void dropNode(Node n) {

    }

    @Override
    public void dropTruck(Truck t) {
        scenarios.forEach(s -> s.getTrucks().remove(t));
    }
}
