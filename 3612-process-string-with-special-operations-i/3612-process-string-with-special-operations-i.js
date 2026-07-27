var processStr = function(s) {
    let sb = [];

    for (let ch of s) {
        if (ch === "*") {
            if (sb.length > 0) {
                sb.pop();
            }
        } else if (ch === "#") {
            sb.push(...sb);
        } else if (ch === "%") {
            sb.reverse();
        } else if (/[a-zA-Z]/.test(ch)) {
            sb.push(ch);
        }
    }

    return sb.join("");
};