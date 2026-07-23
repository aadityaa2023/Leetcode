var longestConsecutive = function(nums) {
    if (nums.length === 0) return 0;

    nums.sort((a, b) => a - b);

    let count = 1;
    let maxSoFar = 1;

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] === nums[i - 1]) {
            continue;
        } else if (nums[i] === nums[i - 1] + 1) {
            count++;
        } else {
            count = 1;
        }

        maxSoFar = Math.max(maxSoFar, count);
    }

    return maxSoFar;
};