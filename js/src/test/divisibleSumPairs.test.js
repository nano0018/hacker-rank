const divisibleSumPairs = require("../divisibleSumPairs");
describe("divisibleSumPairs", () => {
	test("should return 5", () => {
		expect(divisibleSumPairs(6, 3, [1, 3, 2, 6, 1, 2])).toBe(5);
	});
	test("should return 3", () => {
		expect(divisibleSumPairs(6, 5, [1, 2, 3, 4, 5, 6])).toBe(3);
	});
});
