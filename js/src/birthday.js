function birthday(s, d, m) {
	// Write your code here
	let count = 0;
    for (let index = 0; index <= s.length - m; index++) {
        let isCounting = true;
        let sum = 0;
        let innerCount = 0;
        while (isCounting) {
            const currentNumber = s[index + innerCount];
            sum += currentNumber;
            if (innerCount === m - 1) {
                isCounting = false;
            } else {
                innerCount++;
            }
        }
        if (sum === d) {
            count++;
        }
    }
    return count;
}

birthday([2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1], 18, 7);
module.exports = birthday;
