public class hybrid_and extends logic_gate
{
	hybrid_and(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
	hybrid_and(int my_id, int in_a, int in_b, int in_c)
	{
		super(my_id, in_a, in_b, in_c);
	}
	
	//user input is first input second input is from logic gate
	public int calculate()
	{
		if(inputs.get(0)==1)
		{
			for(int i=1; i<inputs.size(); i++)
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
		else
		{
			data.set(id, 0);
			return 0;
		}
	}

	public String toString()
	{
		System.out.print("gate "+id+" ");
		System.out.print("inputs index are ");
		for(int i=1; i<inputs.size(); i++)
		{
			System.out.print(inputs.get(i)+" ");
		}
		
		System.out.print(" input values are ");
		System.out.print(inputs.get(0)+" ");
		for(int i=1; i<inputs.size(); i++)
		{
			System.out.print(data.get(inputs.get(i))+" ");
		}
		
		System.out.println("output is "+data.get(id));
		return "";
	}
}
