import java.util.ArrayList;
import java.util.Scanner;

public class driver 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Integer temp;

		ArrayList<logic_gate> circuit = new ArrayList<logic_gate>();
		ArrayList<Integer> user_inputs = new ArrayList<Integer>();
		//get inputs
		for(int i=0; i<4; i++)
		{
			System.out.println("Enter the values");
			temp = scan.nextInt();
			user_inputs.add(temp);
		}
		user_inputs.add(0); //add INVA
		user_inputs.add(1); //add ENA and ENB
		user_inputs.add(0); //add carryin
		//end get inputs
		
		//make circuit
		//INVA is off
		//ENB and ENA are on
		//carry in is 0
		//a=0, b=1, f_0=2, f_1=3, INVA=4, ENA and ENB=5 carry_in=6
		circuit.add(new start_and(0, user_inputs.get(0), user_inputs.get(5)));
		circuit.add(new start_and(1, user_inputs.get(1), user_inputs.get(5)));
		circuit.add(new hybrid_xor(2, user_inputs.get(4), 0));
		circuit.add(new start_not(3, user_inputs.get(2)));
		circuit.add(new start_not(4, user_inputs.get(3)));
		circuit.add(new start_not(5, user_inputs.get(2)));
		circuit.add(new start_not(6, user_inputs.get(3)));
		circuit.add(new and_gate(7, 2, 1));
		circuit.add(new or_gate(8, 2, 1));
		circuit.add(new not_gate(9, 1));
		circuit.add(new and_gate(10, 3, 4));
		circuit.add(new hybrid_and(11, user_inputs.get(3), 5));
		circuit.add(new hybrid_and(12, user_inputs.get(2), 6));
		circuit.add(new start_and(13, user_inputs.get(2), user_inputs.get(3)));
		circuit.add(new and_gate(14, 7, 10));
		circuit.add(new and_gate(15, 8, 11));
		circuit.add(new and_gate(16, 9, 12));
		circuit.add(new xor_gate(17, 1, 2));
		circuit.add(new hybrid_xor(18, user_inputs.get(6), 17));
		circuit.add(new and_gate(19, 18, 13));
		circuit.add(new and_gate(20, 13, 2, 1));
		circuit.add(new hybrid_and(21, user_inputs.get(6), 17, 13));
		circuit.add(new or_gate(22, 20, 21)); //carryout
		circuit.add(new or_gate(23, 14, 15, 16, 19)); //output
		//end make circuit
				
		for(int i=0; i<circuit.size(); i++)
		{
			circuit.get(i).calculate();
		}
		
		//see internal state
		for(int i=0; i<circuit.size(); i++)
		{
			circuit.get(i).toString();
		}
		System.out.println("output is "+circuit.get(0).data.get(23));
		System.out.println("carryout is "+circuit.get(0).data.get(22));
	}
}