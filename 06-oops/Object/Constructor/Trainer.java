package day27.constructor;

public class Trainer {
   private int id;
   private String name;
   private int totalExperience;
  
  public Trainer(int id, String name,int totalExperience) {
	  super(); 
	  this.id = id;
	  this.name = name;
	  this.totalExperience = totalExperience;
  }

  @Override
  public String toString() {
	return "Trainer [id=" + id + ", name=" + name + ", totalExperience=" + totalExperience + "]";
  }  
}
