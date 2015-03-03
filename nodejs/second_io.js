var fs=require('fs');

//var buff = fs.readFileSync(process.argv.toString());
var buff =null;
 fs.readFile("test.txt", function(err,data){
 	buff
});

var str= buff.toString();

//console.log(buff);
var numbers= str.split('\n');

console.log(numbers.length-1);
