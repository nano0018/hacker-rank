const kangaroo = require("../kangaroo");
describe("kangaroo", () => {
	test("should return YES", () => {
		expect(kangaroo(0, 3, 4, 2)).toBe("YES");
	});
    test("should return NO", () => {
		expect(kangaroo(0, 2, 5, 3)).toBe("NO");
	});
});
