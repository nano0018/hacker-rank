const breakingRecords = require("../breakingRecords");
describe("breakingRecords", () => {
	test("should return [2, 4]", () => {
		expect(breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1])).toStrictEqual([2, 4]);
	});
    test("should return [3, 0]", () => {
		expect(breakingRecords([0, 9, 3, 10, 2, 20])).toStrictEqual([3, 0]);
	});
});
 