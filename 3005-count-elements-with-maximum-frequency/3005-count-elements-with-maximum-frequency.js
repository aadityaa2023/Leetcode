var maxFrequencyElements = function(nums) {
    const map = new Map();

    for (const num of nums) {
        map.set(num, (map.get(num) || 0) + 1);
    }

    let maxFreq = 0;
    for (const freq of map.values()) {
        maxFreq = Math.max(maxFreq, freq);
    }

    let sum = 0;
    for (const freq of map.values()) {
        if (freq === maxFreq) {
            sum += maxFreq;
        }
    }

    return sum;
};