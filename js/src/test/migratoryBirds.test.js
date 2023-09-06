const migratoryBirds = require("../migratoryBirds");
describe("migratoryBirds", () => {
	test("should return [2, 4]", () => {
		expect(migratoryBirds([10, 5, 20, 20, 4, 5, 2, 25, 1])).toStrictEqual([2, 4]);
	});
    test("should return [3, 0]", () => {
		expect(migratoryBirds([0, 9, 3, 10, 2, 20])).toStrictEqual([3, 0]);
	});
});
 