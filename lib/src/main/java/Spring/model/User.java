package Spring.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringApplication;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    
    public void setId(int id)
    {
    	this.id=id;
    }
    
    public int getId()
    {
    	return id;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    }
    
    public String getName()
    {
    	return name;
    }

       
}