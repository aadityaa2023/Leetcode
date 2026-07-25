var maxProduct = function (n) {
    let digits = [];
    let max = 0;

    while (n > 0) {
        digits.push(n % 10);
        n = Math.floor(n / 10);
    }
    for (let i = 0; i < digits.length; i++) {
        for (let j = i + 1; j < digits.length; j++) {
            max = Math.max(max, digits[i] * digits[j]);
        }
    }
    return max;
};