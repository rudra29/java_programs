var numbers=[1,2,3,4,5,6,7,8];

var filtered =numbers.filter(evenNum(numbers[0]));


function evenNum(number){
	return number%2===0;
}