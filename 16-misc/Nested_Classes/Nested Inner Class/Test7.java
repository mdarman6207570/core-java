package non_static_inner_class;

class Person
{
	private String name;
	private int age;
	private Heart heart;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.heart = new Heart(72);
	}
	
	public void describe()
	{
		System.out.println("Name : "+name);
		System.out.println("Name : "+age);
		System.out.println("Heart beats per minute: "+this.heart.getBeatsPerMinute());
	}
	
	//Inner class representing the Heart
	
	private class Heart
	{
		private int beatsPerMinute;

		public Heart(int heartBeats) 
		{
			super();
			beatsPerMinute = heartBeats;
		}
		
		public int getBeatsPerMinute()
		{
			return this.beatsPerMinute;
		}

		public void setBeatsPerMinute(int beatsPerMinute) 
		{
			this.beatsPerMinute = beatsPerMinute;
		}
	}
}


public class Test7 
{
	public static void main(String[] args) 
	{
		Person person = new Person("Arman", 22);
		person.describe();
	}

}
