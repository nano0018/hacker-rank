const staircase = require("../staircase");
describe("staircase", () => {
	test("should return staircase with 0 elements", () => {
		expect(staircase(0)).toBe("");
	});
});
