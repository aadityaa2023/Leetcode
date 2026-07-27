var maximumProduct = function(nums) {
    nums.sort((a, b) => a - b);

    const n = nums.length;

    const c1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
    const c2 = nums[0] * nums[1] * nums[n - 1];

    return Math.max(c1, c2);
};