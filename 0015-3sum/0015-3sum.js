var threeSum = function (nums) {
    nums.sort((a, b) => a - b);

    let set = new Set();
    let ans = [];

    for (let i = 0; i < nums.length - 1; i++) {
        let j = i + 1;
        let k = nums.length - 1;

        while (j < k) {
            let sum = nums[i] + nums[j] + nums[k];

            if (sum === 0) {
                set.add([nums[i], nums[j], nums[k]].join(","));
                j++;
                k--;
            } else if (sum < 0) {
                j++;
            } else {
                k--;
            }
        }
    }

    for (let x of set) {
        ans.push(x.split(",").map(Number));
    }

    return ans;
};