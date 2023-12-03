package ls10.lab.service.impl;

import ls10.lab.model.Airplane;
import ls10.lab.dao.impl.AirPlaneDao;
import ls10.lab.service.impl.InterfaceService.Service;

import java.util.List;

public class AirplaneImpl implements Service<Airplane> {

    private AirPlaneDao mayBayDao = new AirPlaneDao();

    public List<Airplane> getAllAirplanes() {
        return mayBayDao.getAll();
    }

    @Override
    public void create(Airplane object) {

    }

    @Override
    public void display(List<Airplane> object) {
        System.out.println(object);
    }
}
