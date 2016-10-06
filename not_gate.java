public class not_gate extends logic_gate
{
	not_gate(int my_id, int in_a)
	{
		super(my_id, in_a);
	}
	
	public int calculate()
	{
		if(data.get(inputs.get(0))==1)
		{
			data.set(id,0);
			return 0;
		}
		else if(data.get(inputs.get(0))==0)
		{
			data.set(id,1);
			return 1;
		}
		else
		{
			System.out.println("NOT gete fed input that is not 0 or 1");
			return -1;
		}
	}
}
