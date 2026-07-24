var minSteps = function(s, t) {
    let count = new Array(26).fill(0);

    for (let i = 0; i < s.length; i++) {
        count[s.charCodeAt(i) - 97]++;
    }

    for (let i = 0; i < t.length; i++) {
        count[t.charCodeAt(i) - 97]--;
    }

    let steps = 0;

    for (let i = 0; i < 26; i++) {
        if (count[i] > 0) {
            steps += count[i];
        }
    }

    return steps;
};