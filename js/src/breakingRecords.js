function breakingRecords(scores) {
	// Write your code here
	let min;
	let max;
	let maxCount = 0;
	let minCount = 0;
	scores.forEach((score) => {
		if (min === undefined) {
			min = score;
		}

		if (max === undefined) {
			max = score;
		}

		if (score > max) {
			max = score;
			maxCount++;
		}

		if (score < min) {
			min = score;
			minCount++;
		}
	});

	return [maxCount, minCount];
}

module.exports = breakingRecords;
