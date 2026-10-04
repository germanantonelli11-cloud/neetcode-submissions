class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] leftSide = new int[nums.length];
        int[] rightSide = new int[nums.length];
        int leftTotal = 1;
        int rightTotal = 1;
        for (int i = 0; i < nums.length; i++) {
            leftSide[i] = leftTotal;
            leftTotal *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSide[i] = rightTotal;
            rightTotal *= nums[i];
            //System.out.println(Arrays.toString(rightSide));
        }

        for(int i = 0; i < nums.length; i++) {
            output[i] = rightSide[i] * leftSide[i];
        }
    return output;
    }
}
        /*int[] output = new int[nums.length];
        int totalProduct = 1;
        for (int num : nums) {
            totalProduct *= num;
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                output[i] = totalProduct;
            } else {
                output[i] = totalProduct / nums[i];
            }
        }
    return output;

        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int totalProduct = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    totalProduct *= nums[j];
                }
            output[i] = totalProduct;
            }
            /*for(int num : nums) {
                if (num == 0) {
                    continue;
                } else {
                    totalProduct *= num;
                }
                //totalProduct *= num;
                //System.out.println(totalProduct);
            }
            output[i] = totalProduct / nums[i];
        }
        }
        return output;
        
    }
}  */
