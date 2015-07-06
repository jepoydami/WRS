package wrslibrary.models;

import java.util.UUID;

public class SystemUserModel {
        private UUID id;
    private String name;
    
    public UUID getId(){
        return this.id;        
    }
    
    public String getName(){
        return this.name;
    }
}
