var finalPrices = function(prices) {
    const ans = new Array(prices.length);

    for (let i = 0; i < prices.length; i++) {
        ans[i] = prices[i];

        for (let j = i + 1; j < prices.length; j++) {
            if (prices[j] <= prices[i]) {
                ans[i] = prices[i] - prices[j];
                break;
            }
        }
    }

    return ans;
};