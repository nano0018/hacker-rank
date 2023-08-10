function birthdayCakeCandles(candles) {
    // Write your code here
    let max = Math.max(...candles);
    return candles.reduce((acc, curr) => curr === max ? acc + 1 : acc, 0);
}

module.exports = birthdayCakeCandles;