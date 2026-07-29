var lengthOfLongestSubstring = function(s) {
    const set = new Set();
    let i = 0, maxLen = 0;

    for (let j = 0; j < s.length; j++) {
        while (set.has(s[j])) {
            set.delete(s[i]);
            i++;
        }
        set.add(s[j]);
        maxLen = Math.max(maxLen, j - i + 1);
    }

    return maxLen;
};