function gradingStudents(grades) {
	// Write your code here
	return grades.map((grade) => {
		if (grade >= 38) {
			const nextGradeMultiple = Math.ceil(grade / 5) * 5;
			return nextGradeMultiple - grade < 3 ? nextGradeMultiple : grade;
		} else {
			return grade;
		}
	});
}

module.exports = gradingStudents;
