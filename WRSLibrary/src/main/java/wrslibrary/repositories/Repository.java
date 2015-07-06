package wrslibrary.repositories;

import java.util.List;

public interface Repository<T> {
    T create(T model);
    T update(T model);
    T findById(String id);
    boolean delete(T model);
    List<T> findAll();
}
