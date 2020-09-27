package Practice;

import java.util.Arrays;

public class Class1 {

	public static void main(String[] args) {
		//swipe_No();
		//reverse_string();
		//reverse_int();
		//reverse_string_stringbuffer();
		//palindrome();
		//remove_spaces();
		//string_count();						//not completed 
		//reverse_int_in_array();					////not completed 
		//array_avg();
		//sort_int_array();
		//sort_string_array();
		//find_int_from_array_atIndex();
		//find_string_from_array();
		//duplicate_num_Array();
		duplicate_string_Array();
	}
	public static void swipe_No() {
		int a=4; int b=7;
		System.out.println("value of a: "+ a+ " and b: "+b);
		int c=a;
		a=b; b=c;
		System.out.println("value of a: "+ a+ " and b: "+b);	
	}
	public static void reverse_string() {
		String s= "Ambrish"; 
		String rev= " ";
		for (int i= s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	public static void reverse_int() {
		int n= 1234;int rev=0;
		while(n!=0) {
			int a= n%10;
			rev=rev*10+a;
			n=n/10;
		}		
		System.out.println(rev);
	}
	public static void reverse_string_stringbuffer() {
		String s= "Ambrish"; 
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	public static void palindrome() {
		// make it  palindrome
		String s= "ma da m"; 
		String rev="";

		for (int i= s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	public static void remove_spaces() {
		String s = "He l l o";
		String newS=s.replaceAll(" ","");
		System.out.println(newS);
	}
	public static void string_count() {
		String s = "aaabbc";					//print 3A2B1C
		for (int i=0; i<s.length();i++) {
			//System.out.println(s.charAt(i));
			if(s.charAt(i)==i+1) {
				System.out.println(i);
			}
		}
	}
	public static void reverse_int_in_array() {	
		//next in line
	}
	public static void array_avg() {
		int [] arr= {2,4,5,6,7,8,9,5};
		int sum=0;
		for (int i=0; i<arr.length;i++) {
			sum= sum+arr[i];
		}
		System.out.println(sum);
		float avg= (float)sum/arr.length;			// without typecast if would show result as 5.0 not 5.75
		System.out.println(avg);
	}
	public static void sort_int_array() {
		int arr []= {2,3,50,5,6,8,7,9,10};
		System.out.println(Arrays.toString(arr));	// before sorting
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	//after sorting
		for (int n: arr) {
			System.out.print(n+" ");				//remove brackets
		}
	}
	public static void sort_string_array() {
		String [] arrS= {"tata", "ba", "bi", "be", "hello"};
		System.out.println(Arrays.toString(arrS));	// before sorting
		Arrays.sort(arrS);
		System.out.println(Arrays.toString(arrS));	//after sorting
		for (String n: arrS) {
			System.out.print(n+", ");				//remove brackets
		}
	}
	public static void find_int_from_array_atIndex() {
		int arr []= {2,3,50,5,6,8,7,9,10};
		int s_no=6 ;
		for (int i=0;i<arr.length; i++) { 			// or write for(int i :arr)
			if (arr[i]==s_no)
			{
				System.out.println("matching number : " +s_no+" at index :"+i); 
			}
		}
	}

	public static void find_string_from_array() {
		String [] arr= {"tata", "ba", "bi", "be", "hello"};
		String s1="ba";
		for (String s: arr)
		{
			if (s.contentEquals(s1)) {
				System.out.println("matching string : " +s1);
			}
		}
	}
	static void duplicate_num_Array() {
		int arr []= {1,2,3,5,20,4,55,65,2,58,99};
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==(arr[j])) {
					System.out.println("duplicate number found : "+ arr[i]+" , at index  "+i+ " and " +j);
				}
			}
		}
	}
	static void duplicate_string_Array() {
		String arr []= {"tata", "ba", "by", "be", "hello","be", "bye" };
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i].contentEquals(arr[j])) {			
					System.out.println("duplicate number found : "+ arr[i]+" , at index  "+i+ " and " +j);
				}
			}
		}
	}


}
