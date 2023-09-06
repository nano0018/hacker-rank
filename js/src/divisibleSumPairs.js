function divisibleSumPairs(n, k, ar) {
    // Write your code here
    let count = 0;
    for (let index = 0; index < ar.length; index++) {
        for (let innerIndex = index + 1; innerIndex < ar.length; innerIndex++) {
            if ((ar[index] + ar[innerIndex]) % k === 0) {
                count++;
            }
        }
    
    }
    return count;
}

module.exports = divisibleSumPairs;