package wrslibrary.daos;

import java.util.List;

public interface Dao<T> {
    T create(T dto);
    T update(T dto);
    boolean delete(T dto);
    List<T> findAll();
    T findById(String id);
}
