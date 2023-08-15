function getTotalX(a, b) {
    // Write your code here
    a.sort()
    b.sort()
    
    let count = 0
    
    for(let nConsidered = a[a.length - 1]; nConsidered <= b[0]; nConsidered++) {
        if(areAllFactorsOf(nConsidered, a) && isFactorOfAll(nConsidered, b))
            count++
    }
    
    function areAllFactorsOf (nConsidered, aArray) {
        for(const num of aArray) {
            if(nConsidered % num !== 0) return false
        }
        return true
    }
    
    function isFactorOfAll (nConsidered, bArray) {
        for(const num of bArray) {
            if(num % nConsidered !== 0) return false
        }
        return true
    }
    
    return count
}

module.exports = getTotalX;
