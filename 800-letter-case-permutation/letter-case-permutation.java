class Solution {

    public void ff(int i, char arr[], StringBuilder curr, List<String> ans) {

        if (i == arr.length) {
            ans.add(curr.toString());
            return;
        }

        char ch = arr[i];

        if (Character.isDigit(ch)) {

            curr.append(ch);
            ff(i + 1, arr, curr, ans);
            curr.deleteCharAt(curr.length() - 1);

        } else {
            if (Character.isLowerCase(ch)) {

                curr.append(ch);
                ff(i + 1, arr, curr, ans);
                curr.deleteCharAt(curr.length() - 1);

                curr.append(Character.toUpperCase(ch));
                ff(i + 1, arr, curr, ans);
                curr.deleteCharAt(curr.length() - 1);

            } else {

                curr.append(ch);
                ff(i + 1, arr, curr, ans);
                curr.deleteCharAt(curr.length() - 1);

                curr.append(Character.toLowerCase(ch));
                ff(i + 1, arr, curr, ans);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }

    public List<String> letterCasePermutation(String s) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        ff(0, s.toCharArray(), sb, list);

        return list;
    }
}