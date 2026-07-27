var finalValueAfterOperations = function(operations) {
    let x = 0;
    for (const o of operations) x += 44 - o.charCodeAt(1);
    return x;
};