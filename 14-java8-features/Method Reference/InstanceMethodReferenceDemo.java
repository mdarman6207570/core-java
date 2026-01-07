package method_reference;

interface Trainer
{
	void getTraining(String name,int experience);
}

class InstanceMethod
{
	public void getTraining(String name,int experience)
	{
		System.out.println("Trainer name is : "+name+" having "+experience+" years of expeience");
	}
}

public class InstanceMethodReferenceDemo 
{
	public static void main(String[] args) 
	{
		Trainer methodRef = new InstanceMethod()::getTraining;
		methodRef.getTraining("Smith", 10);
	}
}

