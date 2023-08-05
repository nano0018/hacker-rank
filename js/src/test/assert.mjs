export const assertEquals = (expected, actual) => {
	let equals = false;
	if (Array.isArray(actual)) {
		if (expected.length === actual.length) {
			for (let index = 0; index < actual.length; index++) {
				const actualElement = actual[index];
				const expectedElement = expected[index];
				if (actualElement === expectedElement) {
					equals = true;
				}
			}
		}
	}
	if (expected === actual) {
		equals = true;
	}
	if (!equals) {
		console.error("Test failed");
		console.error(`Expected: ${expected}`);
		console.error(`Actual: ${actual}`);
	}
};

export const assertTrue = (condition) => {
	if (condition) {
		return;
	} else {
		console.error("Test failed");
		console.error(`Expected: true`);
		console.error(`Actual: false`);
	}
};

export const assertFalse = (condition) => {
	if (!condition) {
		return;
	} else {
		console.error("Test failed");
		console.error(`Expected: false`);
		console.error(`Actual: true`);
	}
};
