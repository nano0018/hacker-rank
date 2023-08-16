const divisibleSumPairs = require("../divisibleSumPairs");
describe("divisibleSumPairs", () => {
	test("should return 5", () => {
		expect(divisibleSumPairs(6, 5, [1, 2, 3, 4, 5, 6])).toBe(5);
	});
});
