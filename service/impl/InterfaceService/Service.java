package ls10.lab.service.impl.InterfaceService;

import java.util.List;

public interface Service<T> {
    void create(T object);
    void display(List<T> object);



}
