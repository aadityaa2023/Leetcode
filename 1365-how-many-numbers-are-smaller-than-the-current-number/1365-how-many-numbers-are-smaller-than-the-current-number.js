var smallerNumbersThanCurrent = function (nums) {
    return nums.map(num =>
        nums.filter(x => x < num).length
    );
};