public class start_or extends logic_gate 
{
	start_or(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	
	public int calculate()
	{
		for(int i=0; i<inputs.size(); i++)
		{
			if(inputs.get(i)==1)
			{
				data.set(id, 1);
				return 1;
			}
		}
		data.set(id, 0);
		return 0;
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