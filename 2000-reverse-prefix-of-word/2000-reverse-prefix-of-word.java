class Solution {
    public String reversePrefix(String word, char ch) {
        char []arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                reverse(arr, 0, i);
                break;
            }
        }
        return new String(arr);
    }

    void reverse(char[] arr, int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
}