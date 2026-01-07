package blc;

public class LoanNotAllowedException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public LoanNotAllowedException(String msg)
	{
		super(msg);
	}
}
