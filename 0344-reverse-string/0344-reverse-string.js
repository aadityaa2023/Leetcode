var reverseString = function (s) {
    let l = 0;
    let r = s.length - 1;

    while (l < r) {
        let temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
    }

};