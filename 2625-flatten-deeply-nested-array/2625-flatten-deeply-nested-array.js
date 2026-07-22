var flat = function(arr, n) {
    let result = [];

    function flatten(arr, depth) {
        for (let item of arr) {
            if (Array.isArray(item) && depth > 0) {
                flatten(item, depth - 1);
            } else {
                result.push(item);
            }
        }
    }

    flatten(arr, n);
    return result;
};