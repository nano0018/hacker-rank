const timeConversion = require("../timeConversion");
describe("timeConversion", () => {
	test("should return the time in 24 hour format", () => {
		expect(timeConversion("07:05:45PM")).toBe("19:05:45");
        expect(timeConversion("12:01:00PM")).toBe("12:01:00");
        expect(timeConversion("12:01:00AM")).toBe("00:01:00");
	});
});
