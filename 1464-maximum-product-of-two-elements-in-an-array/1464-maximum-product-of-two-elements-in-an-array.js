var maxProduct = function(nums) {
    let maxProd = -Infinity;

    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            let prod = (nums[i] - 1) * (nums[j] - 1);
            maxProd = Math.max(maxProd, prod);
        }
    }

    return maxProd;
};