const countApplesAndOranges = require("../countApplesAndOranges");
describe("countApplesAndOranges", () => {
	test("should return an array with the number of apples and oranges", () => {
		expect(
			countApplesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6])
		).toStrictEqual([1, 1]);
	});
});
