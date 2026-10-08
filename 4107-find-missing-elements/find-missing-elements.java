class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        int[] arr = new int[max - min + 1];

        for (int num : nums) {
            arr[num - min] = 1;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < max - min + 1; i++) {
            if (arr[i] == 0) {
                list.add(i + min);
            }
        }

        return list;
    }
}