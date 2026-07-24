var isPossibleToSplit = function(nums) {
    const count = new Map();

    for (const n of nums) {
        count.set(n, (count.get(n) || 0) + 1);
    }

    for (const val of count.values()) {
        if (val > 2) {
            return false;
        }
    }

    return true;
};