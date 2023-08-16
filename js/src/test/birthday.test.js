const birthday = require("../birthday");
describe("birthday", () => {
	test("should return 2", () => {
		expect(birthday([1, 2, 1, 3, 2], 3, 2)).toBe(2);
	});
	test("should return 0", () => {
		expect(birthday([1, 1, 1, 1, 1, 1], 3, 2)).toBe(0);
	});
	test("should return 1", () => {
		expect(birthday([4], 4, 1)).toBe(1);
	});
	test("should return 3", () => {
		expect(
			birthday(
				[
					2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1,
				],
				18,
				7
			)
		).toBe(3);
	});
});
