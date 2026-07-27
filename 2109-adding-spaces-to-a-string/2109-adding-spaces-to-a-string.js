var addSpaces = function(s, spaces) {
    let ans = [];
    let k = spaces.length;
    let j = 0;

    for (let i = 0; i < s.length; i++) {
        if (j < k && i === spaces[j]) {
            ans.push(" ");
            j++;
        }
        ans.push(s[i]);
    }

    return ans.join("");
};