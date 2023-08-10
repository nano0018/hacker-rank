function staircase(n) {
	// Write your code here
    let completeLine = "";
	for (let index = 1; index <= n; index++) {
		const element = "#";
		const emptySpaces = n - index;
		const currentLine = " ".repeat(emptySpaces) + element.repeat(index);
        completeLine += currentLine + "\n";
	}
    return completeLine
}


module.exports = staircase;
