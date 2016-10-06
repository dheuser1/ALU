public class start_xor extends logic_gate 
{
	start_xor(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	
	public void set_inputs(int i, int j)
	{
		inputs.set(0, i);
		inputs.set(1, j);
	}
	
	public int calculate()
	{	
		if(inputs.get(0)==inputs.get(1))
		{
			data.set(id, 0);
			return 0;
		}
		data.set(id, 1);
		return 1;
	}
	
	public String toString()
	{
		System.out.print("gate "+id+" ");
		System.out.print(" input values are ");
		for(int i=0; i<inputs.size(); i++)
		{
			System.out.print(inputs.get(0)+" ");
		}
		System.out.println("output is "+data.get(id));
		return "";
	}
}
