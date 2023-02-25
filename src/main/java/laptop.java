import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class laptop extends PanacheEntity{
    String Name;
    String Model;
   
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setModel(String model) {
        Model = model;
    }
    public String getModel() {
        return Model;
    }


    
}
