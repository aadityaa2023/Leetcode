var maximumCount = function (nums) {
    let pos = 0;
    let neg = 0;
    for (const  num of nums) {
        if (num > 0) {
            pos++;
        }
        else if (num < 0) {
            neg++;
        }
        else {
            continue;
        }

    }
    let max = Math.max(pos, neg);
    return max;

};