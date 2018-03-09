/**
 * 
 */
package Anagrams;

import java.util.HashSet;
import java.util.Set;

/**
 * @author thejussinghj
 *
 */
public class TwoStringsAreAnagrams {

	private static boolean areAnagrams(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length())
			return false;
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<str1.length(); i++){
			if(!set.contains(str1.charAt(i))){
				set.add(str1.charAt(i));
			}
			else{
				set.remove(str1.charAt(i));
			}
		}
		
		for(int i=0; i<str2.length(); i++){
			if(!set.contains(str2.charAt(i))){
				set.add(str2.charAt(i));
			}
			else{
				set.remove(str2.charAt(i));
			}
		}
		
		return set.size() == 0 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "LISTENS";
		String str2 = "SILSENT";
		System.out.println(areAnagrams(str1, str2));
	}


}
