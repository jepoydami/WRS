
package wrslibrary.mappers;

public interface Mapper<T, U> {
    T toModel(U dto);
    U toDto(T model);
}
