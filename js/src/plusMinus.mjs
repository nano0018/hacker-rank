import { assertEquals } from "./test/assert.mjs";

function plusMinus(arr) {
    // Write your code here
    const totalZeros = arr.filter((number) => number === 0).length;
    const totalPositiveIntegers  = arr.filter((number) => number > 0).length;
    const totalNegativeIntegers = arr.filter((number) => number < 0).length;
    console.log(totalZeros / arr.length);
    console.log(totalPositiveIntegers / arr.length);
    console.log(totalNegativeIntegers / arr.length);
    return [totalPositiveIntegers / arr.length, totalNegativeIntegers / arr.length, totalZeros / arr.length];
}

assertEquals([0.4000, 0.4000, 0.2000], plusMinus([1, 1, 0, -1, -1]));
assertEquals([0.5000, 0.3333, 0.1667], plusMinus([-4, 3, -9, 0, 4, 1]));