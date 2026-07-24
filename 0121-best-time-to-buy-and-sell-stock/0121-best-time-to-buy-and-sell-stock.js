var maxProfit = function(prices) {
    let cprice = prices[0];
    let maxprofit =0;

    for(let i=1; i<prices.length; i++){
        if(prices[i] < cprice){
            cprice = prices[i];
        }
        else{
            let cprofit = prices[i] - cprice;
            maxprofit = Math.max(maxprofit , cprofit);
        }
    }
    return maxprofit;
    
};