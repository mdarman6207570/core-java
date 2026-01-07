package blc;

public class CarStoppedException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CarStoppedException(String errorMessage)
	{
		super(errorMessage);
	}
}
