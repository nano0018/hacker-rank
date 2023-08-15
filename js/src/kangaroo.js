function kangaroo(x1, v1, x2, v2) {
	// Write your code here
	const division = (x1 - x2) / (v2 - v1);
	if (division < 0 || division % 1 !== 0) {
		return "NO";
	} else {
		return "YES";
	}
}

module.exports = kangaroo;
