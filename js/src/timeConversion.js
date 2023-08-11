function timeConversion(s) {
	// Write your code here
	let timeRegex = /[a-zA-Z]+/gm;
	let numbers = s.split(timeRegex).join("").split(":");
	let period = s.match(timeRegex);
	let hour = parseInt(numbers[0]);
	let minute = numbers[1];
	let seconds = numbers[2];

	if (period == "PM" && hour < 12) {
		hour += 12;
	}

	if (period == "AM" && hour == 12) {
		hour = 0;
	}

	if (hour < 10) {
		hour = "0" + hour;
	}

	return `${hour}:${minute}:${seconds}`;
}

module.exports = timeConversion;
