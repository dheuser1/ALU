public class hybrid_xor extends logic_gate 
{
	hybrid_xor(int my_id, int in_a, int in_b)
	{
		super(my_id, in_a, in_b);
	}
		
	//user input is first input second input is from logic gate
	public int calculate()
	{
		if((inputs.get(0))==(data.get(inputs.get(1))))
		{
			data.set(id, 0);
			return 0;
		}
		else
		{
			data.set(id, 1);
			return 1;
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
