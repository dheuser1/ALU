//the start gates hold the values for the inputs in the input array rather than the indexes of the inputs
//this is done so they can be fed the values to use directly 
public class start_not extends logic_gate
{
	start_not(int my_id, int in_a)
	{
		super(my_id, in_a);
	}
	
	
	public int calculate()
	{
		if(inputs.get(0)==1)
		{
			data.set(id,0);
			return 0;
		}
		else if(inputs.get(0)==0)
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
