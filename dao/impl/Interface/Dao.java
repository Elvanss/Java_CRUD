package ls10.lab.dao.impl.Interface;

import java.util.List;
public interface Dao<T> {

    int insert(T data);
    List <T> getAll();
}
