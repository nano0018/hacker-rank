function diagonalDifference(arr) {
    // Write your code here
    let sumLeft = 0;
    let sumRight = 0;
    let row = 0;
    for(let i=0; i < arr.length; i++) {
        let leftValue = arr[row][i];
        let rightValue = arr[row][(arr.length - 1) - i];
        sumLeft += leftValue;
        sumRight += rightValue;
        row++;
    }
    return Math.abs(sumLeft - sumRight);
}

module.exports = diagonalDifference;
