import java.util.*;
public abstract class logic_gate 
{
	//hold all the output values of the gates
	public static ArrayList<Integer> data = new ArrayList<Integer>();
	
	//the inputs, will hold the ids of the inputs
	public ArrayList<Integer> inputs = new ArrayList<Integer>();
	public int id;
	int output; 
	
	//for one input gate
	public logic_gate(int my_id, int in_a)
	{
		id=my_id;
		inputs.add(in_a);
		//put a place to hold output in the output array
		data.add(0);
	}
	
	//for two input gate
	public logic_gate(int my_id, int in_a, int in_b)
	{
		id=my_id;
		inputs.add(in_a);
		inputs.add(in_b);
		//put a place to hold output in the output array
		data.add(0);
	}
	
	//for three input gate
	public logic_gate(int my_id, int in_a, int in_b, int in_c)
	{
		id=my_id;
		inputs.add(in_a);
		inputs.add(in_b);
		inputs.add(in_c);
		//put a place to hold output in the output array
		data.add(0);
	}
	
	//for four input gate
	public logic_gate(int my_id, int in_a, int in_b, int in_c, int in_d)
	{
		id=my_id;
		inputs.add(in_a);
		inputs.add(in_b);
		inputs.add(in_c);
		inputs.add(in_d);
		//put a place to hold output in the output array
		data.add(0);
	}
	
	public void set_inputs(int i)
	{
		inputs.set(0, i);
	}
		
	
	public String toString()
	{
		System.out.print("gate "+id+" ");
		System.out.print("inputs index are ");
		for(int i=0; i<inputs.size(); i++)
		{
			System.out.print(inputs.get(i)+" ");
		}
		
		System.out.print(" input values are ");
		for(int i=0; i<inputs.size(); i++)
		{
			System.out.print(data.get(inputs.get(i))+" ");
		}
		
		
		System.out.println(" output is "+data.get(id));
		return "";
	}
	
	//Override in other methods 
	public abstract int calculate();
}