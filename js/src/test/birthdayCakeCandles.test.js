const birthdayCakeCandles = require("../birthdayCakeCandles");

describe("birthdayCakeCandles", () => {
	test("should return the tallest candle count", () => {
		expect(birthdayCakeCandles([3, 2, 1, 3])).toBe(2);
        expect(birthdayCakeCandles([4, 4, 1, 3])).toBe(2);
	});
});
