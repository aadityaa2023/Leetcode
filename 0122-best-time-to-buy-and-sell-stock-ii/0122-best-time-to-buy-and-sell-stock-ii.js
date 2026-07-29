var maxProfit = function (prices) {
    let totalprofit = 0;

    for (let i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            totalprofit = totalprofit + prices[i] - prices[i - 1];

        }
    }
    return totalprofit;

};