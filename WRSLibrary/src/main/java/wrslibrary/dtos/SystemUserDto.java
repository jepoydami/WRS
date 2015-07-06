package wrslibrary.dtos;

import java.util.UUID;

public class SystemUserDto {
    private UUID id;
    private String name;
    
    public UUID getId(){
        return this.id;        
    }
    
    public String getName(){
        return this.name;
    }
}
