package blc;

class Animall
{
  private String name;

  public Animall(String name) 
  {
	super();
	this.name = name;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }
 
}


class Mammall extends Animall {
	private boolean hasFur;
    
	public Mammall(boolean hasFur,String name) {
		super(name);
		this.hasFur =hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	
}


public class Dogg extends Mammall {
	private String breed;
	private String name;

	public Dogg(String name,boolean hasFur, String breed) {
		super(hasFur,name);
		this.breed = breed;
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [ getName () ="+getName()+ ", isHasFur()="+isHasFur()+ ", breed="+getBreed();
	}
	
	
}
	
	
	