public class xor_gate extends logic_gate 
{
	xor_gate(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	
	public int calculate()
	{
		if((data.get(inputs.get(0)))==(data.get(inputs.get(1))))
		{
			data.set(id, 0);
			return 0;
		}
		data.set(id, 1);
		return 1;
	}
}
