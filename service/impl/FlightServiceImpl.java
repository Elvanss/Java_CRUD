package ls10.lab.service.impl;

import ls10.lab.dao.impl.FlightDao;
import ls10.lab.model.Flight;
import ls10.lab.service.impl.InterfaceService.Service;

import java.util.List;

public class FlightServiceImpl implements Service<Flight> {

    private FlightDao flightDao = new FlightDao();

    public FlightServiceImpl() {
        this.flightDao = new FlightDao();
    }

    public List<Flight> getAllFlights() {
        return flightDao.getAll();
    }

    @Override
    public void create(Flight object) {}

    @Override
    public void display(List<Flight> object) {
        System.out.println(object);
    }
}
