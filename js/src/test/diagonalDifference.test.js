const diagonalDifference = require("../diagonalDifference.mjs");
describe("diagonalDifference", () => {
	test("should return the difference between the two diagonals", () => {
		expect(
			diagonalDifference([
				[1, 2, 3],
				[4, 5, 6],
				[9, 8, 9],
			])
		).toBeCloseTo(2);
		expect(
			diagonalDifference([
				[11, 2, 4],
				[4, 5, 6],
				[10, 8, -12],
			])
		).toBeCloseTo(15);
	});
});
