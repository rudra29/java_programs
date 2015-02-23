//console.log("HELLO WORLD ";
var arguments = process.argv;
var sum=0;
for(var i=2;i<arguments.length;i++)
{
	console.log(arguments[i]);
   sum+= arguments[i];
}

console.log(sum);