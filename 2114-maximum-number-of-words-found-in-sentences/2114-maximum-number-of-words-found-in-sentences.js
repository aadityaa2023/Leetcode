/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let maxcount=0;
    for(let i=0; i<sentences.length; i++) {
            maxcount = Math.max(maxcount,(sentences[i].split(" ")).length);
        }
        return maxcount;
    
};