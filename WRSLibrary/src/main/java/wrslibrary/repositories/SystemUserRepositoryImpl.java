package wrslibrary.repositories;

import wrslibrary.dtos.SystemUserDto;
import java.util.List;
import wrslibrary.models.SystemUserModel;
import wrslibrary.daos.Dao;
import wrslibrary.mappers.Mapper;

public class SystemUserRepositoryImpl implements Repository<SystemUserModel>{

    private final Dao<SystemUserDto> dao;
    private final Mapper<SystemUserModel, SystemUserDto> mapper;
    
    public SystemUserRepositoryImpl( 
            Dao<SystemUserDto> dao,
            Mapper<SystemUserModel, SystemUserDto> mapper){
        this.dao = dao;
        this.mapper = mapper;
    }
    
    @Override
    public SystemUserModel create(SystemUserModel model) {
        SystemUserDto dto = mapper.toDto(model);
        dto = dao.create(dto);
        return mapper.toModel(dto);
    }

    @Override
    public SystemUserModel update(SystemUserModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SystemUserModel findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SystemUserModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SystemUserModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
