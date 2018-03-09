/**
 * 
 */
package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author thejussinghj
 *
 */
public class PrintAnagramsTogether {

	public static List<List<String>> groupAnagrams(String[] dict){
		Map<String, List<String>> hash = new HashMap<>();
		for(String s : dict){
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String key = new String(charArray);
			if(hash.containsKey(key)){
				hash.get(key).add(s);
			}
			else{
				List<String> list = new ArrayList<>();
				list.add(s);
				hash.put(key, list);
			}
		}
		return new ArrayList<>(hash.values());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordArr[] = {"cat", "dog", "tac", "god", "act"};
		System.out.println(groupAnagrams(wordArr));
	}

}
