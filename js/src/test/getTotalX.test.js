const getTotalX = require("../getTotalX");
describe("getTotalX", () => {
	test("should return 2", () => {
		expect(getTotalX([2, 6], [24 , 36])).toBe(2);
	});
});
