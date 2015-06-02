import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;


public class YieldTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the strip details:");
		Scanner in = new Scanner(System.in);
		int count = 1;
		Integer mineInt;
		ArrayList<Mine> al = new ArrayList<Mine>();
		for(String mine: new String(in.nextLine()).split(",")) {
			try {
				mineInt = new Integer(mine);
				al.add(new Mine(mineInt, count));

			} catch(Exception e) {
				e.printStackTrace();
			}
			count = count + 1;
		}

		Collections.sort(al);
		Collections.reverse(al);

		Mine top = al.get(0);
		Mine head = top;
		int totalmQuality = top.mQuality;
		String indices = new Integer(top.index).toString() + " | ";
		for(Mine m : al) {
			if(head.index != m.index) {
				if(Math.abs(head.index - m.index) > 1) {
					totalmQuality += m.mQuality;
					indices += new Integer(m.index).toString() + " | ";
					head = m;
				} 
			}
		}
		
		System.out.println("Total Quality: " + totalmQuality + " & Indices: " + indices.substring(0, indices.length() - 3));
	}

}
