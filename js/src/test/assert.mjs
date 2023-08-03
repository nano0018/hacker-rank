const assertEquals = (expected, actual) => {
	if (expected === actual) {
		return;
	} else {
		console.error("Test failed");
		console.error(`Expected: ${expected}`);
		console.error(`Actual: ${actual}`);
	}
};

export default assertEquals;