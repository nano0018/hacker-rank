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

import {assertEquals} from './test/assert.mjs';
assertEquals(diagonalDifference([[1, 2, 3], [4, 5, 6], [9, 8, 9]]), 2);
assertEquals(diagonalDifference([[11, 2, 4], [4, 5, 6], [10, 8, -12]]), 15);