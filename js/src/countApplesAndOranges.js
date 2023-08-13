function countApplesAndOranges(s, t, a, b, apples, oranges) {
	// Write your code here
	let appleCount = 0;
	let orangeCount = 0;
	apples.forEach((element) => {
		const applePosition = a + element;
		if (applePosition >= s && applePosition <= t) {
			appleCount++;
		}
	});
	oranges.forEach((element) => {
		const orangePosition = b + element;
		if (orangePosition >= s && orangePosition <= t) {
			orangeCount++;
		}
	});
    return [appleCount, orangeCount];
}

module.exports = countApplesAndOranges;