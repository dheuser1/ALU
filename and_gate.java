public class and_gate extends logic_gate 
{
	and_gate(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	and_gate(int my_id, int in_a, int in_b, int in_c)
	{
		super(my_id, in_a, in_b, in_c);
	}
	
	public int calculate()
	{
		for(int i=0; i<inputs.size(); i++)
		{
			if(data.get(inputs.get(i))==0)
			{
				data.set(id, 0);
				return 0;
			}
		}
		data.set(id, 1);
		return 1;
	}
}
