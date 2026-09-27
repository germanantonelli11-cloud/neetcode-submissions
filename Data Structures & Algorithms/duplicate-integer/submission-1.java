class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
/*            int currentNum = nums[i];
            if(map.containsKey(currentNum)) {
                return true;
            }
        map.put

*/            for (int j = i + 1; j < nums.length; j++) {
                int currentNum = nums[i];
                if (currentNum == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
   /*         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            //map.put(nums[i], i);
            if (map.get(i) == 2) {
                return true;
            }
        
    //Integer i = wordCounts.get(w);
        }
    return false;
    }
}

  for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;

                }
            }   
        }
    }
}
 
        //int currentNum = nums[i]
        map.put(nums[i], i);
        if (map == 2) {
            return true;
        }
        }
    return false;
    }
}
*/
// Source - https://stackoverflow.com/q/13163547
// Posted by lynks
// Retrieved 2026-09-27, License - CC BY-SA 3.0

/*
String words[] = {"the","cat","in","the","hat"};
HashMap<String,Integer> wordCounts = new HashMap<String,Integer>(50,10);
for(String w : words) {
    if(i == null) wordCounts.put(w, 1);
    else wordCounts.put(w, i + 1);
}*/


    /*
    for(int i = 0; i < nums.length; i++) {
        for(int j = i + 1; i < nums.length; i++) {
            int currentNum = nums[i];
            int duplicate = nums[j];
            if(duplicate == currentNum) {
                return true;
            }
            return false;
        }
    }
    return false;
}*/