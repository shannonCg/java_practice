package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class FindDepulicateList {

	public static void main(String[] args) {
		List<Long> duplicates = Arrays.asList(1L,2L,3L,2L,2L,1L);
		System.out.println(duplicates);
		List<Long> dup = duplicates.stream().filter(d -> Collections.frequency(duplicates, d) > 1).collect(Collectors.toList());
		System.out.println(dup);
		
		List<Long> distincts = duplicates.stream().distinct().collect(Collectors.toList());
		System.out.println(distincts);
		
		List<Long> lessOneDuplicates = new FindDepulicateList().getLessOneDuplicateElements(duplicates);
		System.out.println(lessOneDuplicates);
		
	}

	protected List<Long> getLessOneDuplicateElements(List<Long> duplicates){
		Map<Long, Integer> elementCounts = new ConcurrentHashMap<Long, Integer>();
		List<Long> newDuplicates = new ArrayList<Long>();
		for(Long duplicate : duplicates){
			if(!elementCounts.containsKey(duplicate)){
				elementCounts.put(duplicate, 0);
			}
			Integer count = elementCounts.get(duplicate);
			if(count > 0){
				newDuplicates.add(duplicate);
			}
			elementCounts.put(duplicate, ++count);
		}
		
		return newDuplicates;
	}
}
