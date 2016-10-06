public class or_gate extends logic_gate
{
	or_gate(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	
	or_gate(int my_id, int in_a, int in_b, int in_c, int in_d)
	{
		super(my_id, in_a, in_b, in_c, in_d);
	}
	
	public int calculate()
	{
		for(int i=0; i<inputs.size(); i++)
		{
			if(data.get(inputs.get(i))==1)
			{
				data.set(id, 1);
				return 1;
			}
		}
		data.set(id, 0);
		return 0;
	}
}
