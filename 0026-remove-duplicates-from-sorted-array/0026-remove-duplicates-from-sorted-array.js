var removeDuplicates = function(nums) {
    const set = new Set();
    let i = 0;

    for (const num of nums) {
        if (!set.has(num)) {
            set.add(num);
            nums[i] = num;
            i++;
        }
    }

    return i;
};