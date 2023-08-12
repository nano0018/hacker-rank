const gradingStudents = require("../gradingStudents");
describe("gradingStudents", () => {
	test("should return the list of grades with the rounded grades", () => {
		expect(gradingStudents([73, 67, 38, 33])).toStrictEqual([75, 67, 40, 33]);
	});
});
