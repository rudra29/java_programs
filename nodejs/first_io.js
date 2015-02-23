var fs=require('fs');

//var buff = fs.readFileSync(process.argv.toString());
var buff = fs.readFileSync("test.txt");

var str= buff.toString();

//console.log(buff);
var numbers= str.split('\n');

console.log(numbers.length-1);
