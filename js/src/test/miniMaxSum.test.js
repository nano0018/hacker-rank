const miniMaxSum = require("../miniMaxSum");
describe("diagonalDifference", () => {
	test("should return the difference between the two diagonals", () => {
		expect(miniMaxSum([1, 2, 3, 4, 5])).toBe("10 14");
		expect(miniMaxSum([1, 3, 5, 7, 9])).toBe("16 24");
	});
});
