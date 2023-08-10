function miniMaxSum(arr) {
	// Write your code here
	let minSum = 0;
	let maxSum = 0;
	for (let index = 0; index < arr.length; index++) {
		const element = arr[index];
		const currentSum = arr.reduce((acc, curr) => acc + curr, 0) - element;

		if (minSum === 0) {
			minSum = currentSum;
		}

		if (currentSum > maxSum) {
			maxSum = currentSum;
		}

		if (currentSum < minSum) {
			minSum = currentSum;
		}
	}
	return `${String(minSum)} ${String(maxSum)}`;
}

module.exports = miniMaxSum;
