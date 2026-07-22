var expect = function(val) {
    return {
        toBe(other) {
            if (val === other) return true;
            throw new Error("Not Equal");
        },

        notToBe(other) {
            if (val !== other) return true;
            throw new Error("Equal");
        }
    };
};