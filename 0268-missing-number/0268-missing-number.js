var missingNumber = function (nums) {
    const n = nums.length;
    let esum = n * (n + 1) / 2;
    let asum = 0;
    for (const num of nums) {
        asum = asum + num;
    }
    return esum - asum;
};