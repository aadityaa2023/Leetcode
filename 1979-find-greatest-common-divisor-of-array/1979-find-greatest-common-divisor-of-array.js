var findGCD = function (nums) {
    nums.sort((a, b) => a - b);

    let o = nums[0];
    let e = nums[nums.length - 1];

    while (o !== 0) {
        let temp = o;
        o = e % o;
        e = temp;
    }

    return e;
};